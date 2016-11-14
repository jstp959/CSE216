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
        if ((u.getPrivilege()).equals("admin")) {
            return true;
        }
        return false;
    }
    
    public static Lab createLabType(String name, String street, String city, String state, String zip, String email, String faxNo, String phoneNo, Boolean onSite) {
        //check other besides just name
        if(isValidLab(name, street, city, state, zip, email, faxNo, phoneNo, onSite)){
            Lab lab = new Lab(name, street, city, state, zip, email, faxNo, phoneNo, onSite);
            return lab;
        }
        return null;
    }
    
    public static boolean isValidLab(String name, String street, String city, String state, String zip, String email, String faxNo, String phoneNo, Boolean onSite){
        return !name.equals("") && !street.equals("") && !city.equals("") && !state.equals("") 
                && !zip.equals("") && !faxNo.equals("") && !phoneNo.equals("");
    }
    
    public static String addLabType(String name, String street, String city, String state, String zip, String email, String faxNo, String phoneNo, Boolean onSite) {
        //check privilege
        Lab lab = createLabType(name, street, city, state, zip, email, faxNo, phoneNo, onSite);
        if(lab == null)
        {
            return "Error: Lab requires all fields be filled";
        }
        
        if (DBManager.checkUnique(lab)) {
            if (DBManager.saveExamType(lab)) {
                return "Lab \"" + name + "\" Added";
            }
            return "Error: Could not save in Database";
        }
        else {
            //some error
            return "Error: Lab with name \"" + name + "\" already exists";
        }
    }
}
