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
    String error; 

    public static Boolean checkPrivilege(User u) {
        if ((u.getPrivilege()).equals("admin")) {
            return true;
        }
        return false;
    }
    
    public static ExamType createExamType(String type, String desc) {
        if(!type.equals("")){
            ExamType exam = new ExamType(type, desc);
            return exam;
        }
        return null;
    }
    
    public static Boolean addExamType(String name, String desc) {
        //check privilege
        ExamType exam = createExamType(name, desc);
        if(exam == null)
        {
            return false;
        }
        
        if (DBManager.checkUnique(exam)) {
            if (DBManager.saveExamType(exam)) {
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

