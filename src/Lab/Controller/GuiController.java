/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab.Controller;

import Lab.BusinessObjects.*;
import Lab.DBManager.*;

/**
 *
 * @author owner
 */
public class GuiController {

    public static Boolean checkPrivilege(User u) {
        if (u == null) {
            return false;
        }
        return (u.getPrivilege()).equals("admin");
    }

    public static Lab createLabType(String name, String street, String city, String state, String zip, String email, String faxNo, String phoneNo, Boolean onSite) {
        //check other besides just name
        if (isValidLab(name, street, city, state, zip, email, faxNo, phoneNo, onSite)) {
            Lab lab = new Lab(name, street, city, state, zip, email, faxNo, phoneNo, onSite);
            return lab;
        }
        return null;
    }

    public static boolean isValidLab(String name, String street, String city, String state, String zip, String email, String faxNo, String phoneNo, Boolean onSite) {
        return !name.equals("") && !street.equals("") && !city.equals("") && !state.equals("")
                && !zip.equals("") && !email.equals("") && !faxNo.equals("") && !phoneNo.equals("");
    }

    public static String addLabType(String name, String street, String city, String state, String zip, String email, String faxNo, String phoneNo, Boolean onSite) {
        //check privilege
        if (!DBManager.connector()) {
            return "Error: Connection Failed";
        }
        Lab lab = createLabType(name, street, city, state, zip, email, faxNo, phoneNo, onSite);
        if (lab == null) {
            DBManager.closer();
            return "Error: Lab requires all fields be filled";
        }
        if (DBManager.checkUnique(lab)) {
            String msg = DBManager.saveLab(lab);
            DBManager.closer();
            return msg;
        } else {
            DBManager.closer();
            return "Error: Lab with name \"" + name + "\" and street \"" + street + "\" already exists";
        }
    }
}
