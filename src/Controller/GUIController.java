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
    
    public static String addExamType(String name, String desc) {
        //check privilege
        ExamType exam = createExamType(name, desc);
        if(exam == null)
        {
            return "Error: Exam Type requires a name";
        }
        
        if (DBManager.checkUnique(exam)) {
            if (DBManager.saveExamType(exam)) {
                return "Exam Type \"" + name + "\" Added";
            }
            return "Error: Could not save in Database";
        }
        else {
            //some error
            return "Exam Type with name \"" + name + "\" already exists";
        }
        
    }
}

