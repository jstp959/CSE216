/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import BusinessObjects.*;
import DBManager.*;

/**
 *
 * @author elisecross
 */
public class GUIController {

    public static Boolean checkPrivilege(User u) {
        if ((u.getPrivilege()).equals("admin")) {
            return true;
        }
        return false;
    }
    
    public static ExamType createExamType(String type, String desc) {
        ExamType e = new ExamType(type, desc);
        return e;
    }
    
    public static Boolean addExamType(String name, String desc) {
        //check privilege
        ExamType e = createExamType(name, desc);
        
        if (DBManager.checkUnique(e) == true) {
            if (DBManager.saveExamType(e) == true) {
                return true;
            }
            return false;
        }
        else {
            //some error
            return false;
        }
        
    }
}

