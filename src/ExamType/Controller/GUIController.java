
package ExamType.Controller;

import ExamType.BusinessObjects.*;
import ExamType.DBManager.*;
import ExamType.GUI.*;
import java.util.ArrayList;

/**
 * GUI Controller for ExamType class.
 * Handles interaction between GUI and business objects when interacting 
 * with ExamTypes.
 * 
 * @author JSP, Ferg
 */
public class GUIController {
    
    static ArrayList<ExamType> examTypeList;
    

    /**
     * Check privilege of user logged in to make sure they have authority to 
     * access Exam Types.
     * 
     * @param u     User logged into system
     * @return      true if admin, false o/w
     */
    public static Boolean checkPrivilege(User u) {
        if (u == null) {
            return false;
        }
        return (u.getPrivilege()).equals("admin");
    }
    
    /** 
     * Create a new Exam Type object in the database
     * 
     * @param type  name of new exam type
     * @param desc  optional description of new exam type
     * @return      the object created if successful, null o/w
     */
    public static ExamType createExamType(String type, String desc) {
        if(!type.equals("")){
            ExamType exam = new ExamType(type, desc);
            return exam;
        }
        return null;
    }
    
    /**
     * Method to add new Exam Type. 
     * Deals with checking if the new exam is unique and dealing with the 
     * database.
     * 
     * @param name  name of new exam type
     * @param desc  optional description
     * @return      message with the result
     */
    public static String addExamType(String name, String desc) {
        //TODO: check privilege
        
        //open DB
        if (!DBManager.connector()) {
            return "Error: Connection Failed";
        }
        //create exam type object
        ExamType exam = createExamType(name, desc);
        //check if creation was successfull
        if(exam == null)
        {
            DBManager.closer();
            return "Error: Exam Type requires a name";
        }
        //make sure entry is unique before success
        if (DBManager.checkUnique(exam)) {
            String msg = DBManager.saveExamType(exam);
            DBManager.closer();
            return msg;
        } else {
            DBManager.closer();
            return "Error: Exam Type with name \"" + name + "\" already exists";
        }        
    }
    
    public static ArrayList<ExamType> refreshList(){
        examTypeList = DBManager.getAllExamTypes();
        return examTypeList;
    }
    
    public static ExamType getExamType(int index){
        return examTypeList.get(index);
    }
}

