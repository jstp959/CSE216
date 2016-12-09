/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab.Controller;

import Lab.BusinessObjects.*;
import Lab.DBManager.*;
import java.util.ArrayList;

/**
 * GUI controller deals with communication between GUI and business objects for
 * lab interactions.
 *
 * @author JSP, Ferg
 */
public class GUIController {

    static ArrayList<Lab> labList;

    /**
     * Check privilege of user logged into system. Ensures the user has
     * permission to make changes.
     *
     * @param u Current user logged in to system
     * @return true if admin, false o/w
     */
    public static Boolean checkPrivilege(User u) {
        if (u == null) {
            return false;
        }
        return (u.getPrivilege()).equals("admin");
    }

    /**
     * Create new Lab object
     *
     * @param name Lab name
     * @param street street address
     * @param city city
     * @param state 2 letter state abbreviation
     * @param zip 5 digit zip code
     * @param email email
     * @param faxNo fax number
     * @param phoneNo phone number
     * @param onSite whether or not the lab is on-site (relative to hospital)
     * @return lab object is creation is successful, null o/w
     */
    public static Lab createLab(String name, String street, String city, String state, String zip, String email, String faxNo, String phoneNo, Boolean onSite) {
        //check other besides just name
        if (isValidLab(name, street, city, state, zip, email, faxNo, phoneNo, onSite)) {
            Lab lab = new Lab(name, street, city, state, zip, email, faxNo, phoneNo, onSite);
            return lab;
        }
        return null;
    }

    /**
     * Check if all data is filled in for a new lab to be created. All fields
     * are mandatory.
     *
     * @param name lab name
     * @param street street address
     * @param city city
     * @param state 2 letter state abbreviation
     * @param zip 5 digit zip code
     * @param email email contact
     * @param faxNo fax number
     * @param phoneNo phone number
     * @param onSite whether the lab is on-site, relative to the hospital
     * @return true if lab is valid, false o/w
     */
    public static boolean isValidLab(String name, String street, String city, String state, String zip, String email, String faxNo, String phoneNo, Boolean onSite) {
        return !name.equals("") && !street.equals("") && !city.equals("") && !state.equals("")
                && !zip.equals("") && !email.equals("") && !faxNo.equals("") && !phoneNo.equals("");
    }

    /**
     * Add new lab to database. This method deals with the DBManager and
     * ensuring new labs are unique.
     *
     * @param name lab name
     * @param street street address
     * @param city city
     * @param state 2 letter state abbreviation
     * @param zip 5 digit zip code
     * @param email email contact
     * @param faxNo fax number
     * @param phoneNo phone number
     * @param onSite whether the lab is on-site, relative to the hospital
     * @return message with result
     */
    public static String addLab(String name, String street, String city, String state, String zip, String email, String faxNo, String phoneNo, Boolean onSite) {
        //check privilege
        if (!DBManager.connector()) {
            return "Error: Connection Failed";
        }
        Lab lab = createLab(name, street, city, state, zip, email, faxNo, phoneNo, onSite);
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

    public static String updateLab(String name, String street, String city, String state, String zip, String email, String faxNo, String phoneNo, Boolean onSite) {
        if (!DBManager.connector()) {
            return "Error: Connection Failed";
        }
        Lab lab = createLab(name, street, city, state, zip, email, faxNo, phoneNo, onSite);
        if (lab == null) {
            DBManager.closer();
            return "Error: Lab requires all fields be filled";
        } else {
            String msg = DBManager.updateLab(lab);
            DBManager.closer();
            return msg;

        }
        //TODO
    }

    public static ArrayList<Lab> refreshList() {
        try {
            DBManager.connector();
            labList = DBManager.getAllLabs();
        } finally {
            DBManager.closer();
        }
        return labList;
    }

    public static Lab getLab(int index) {
        return labList.get(index);
    }

}