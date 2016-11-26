/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamType.Controller;

import ExamType.BusinessObjects.*;
import ExamType.DBManager.*;
import ExamType.GUI.*;

/**
 *
 * @author elisecross
 */
public class GUIController {
    

    public static Boolean checkPrivilege(User u) {
        if (u == null) {
            return false;
        }
        return (u.getPrivilege()).equals("admin");
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
        if (!DBManager.connector()) {
            return "Error: Connection Failed";
        }
        ExamType exam = createExamType(name, desc);
        if(exam == null)
        {
            DBManager.closer();
            return "Error: Exam Type requires a name";
        }
        if (DBManager.checkUnique(exam)) {
            String msg = DBManager.saveExamType(exam);
            DBManager.closer();
            return msg;
        } else {
            DBManager.closer();
            return "Error: Exam Type with name \"" + name + "\" already exists";
        }        
    }
}

