/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab.BusinessObjects;

import ExamType.BusinessObjects.*;

/**
 *
 * @author elisecross
 */
public class User {
    
    private String userID;
    private String password;
    private String privilege;

    public User(String userID, String password, String privilege) {
        this.userID = userID;
        this.password = password;
        this.privilege = privilege;
    }
    

    
    public String getPrivilege() {
        return this.privilege;
    }
}
