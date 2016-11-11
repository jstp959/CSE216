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
    
    public ExamType createExam() {
        return null;
    }
    
    public Boolean addExam() {
        return null;
    }
}

