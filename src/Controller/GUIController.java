/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import BusinessObjects.*;

/**
 *
 * @author elisecross
 */
public class GUIController {

    public Boolean checkPrivilege(User u) {
        if ((u.getPrivilege()).equals("admin")) {
            return true;
        }
        return false;
    }
    
    public ExamType createExamType(String type, String desc) {
        ExamType e = new ExamType(type, desc);
        return e;
    }
    
    public Boolean addExamType(String name, String desc) {
        return null;
    }
}

