/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Lab.BusinessObjects.*;
import Lab.Controller.GUIController;

/**
 *
 * @author owner
 */
public class GuiControllerJUnitTest {
    
    User admin;
    User noAdmin;
    
    @Before
    public void setUp() {
        admin = new User("JSP", "abc123", "admin");
        noAdmin = new User("Ferg", "fergSucks", "staff");
    }
    
    @Test
    public void testCheckPrivilege(){
        assertEquals(GUIController.checkPrivilege(admin), true);
        assertEquals(GUIController.checkPrivilege(noAdmin), false);
        assertEquals(GUIController.checkPrivilege(null), false);
    } 
    
    @Test
    public void testCreatLabType(){
        Lab lab1 = new Lab("Test" , "10 Holyoke Road", "Rockville Centre,", "NY",
            "11570", "jes418", "516", "6328925", true);
        Lab lab2 = GUIController.createLab("Test" , "10 Holyoke Road", "Rockville Centre,", "NY",
            "11570", "jes418", "516", "6328925", true);
        
        assertEquals(lab1.compareTo(lab2), 0);
        
        Lab lab3 = GUIController.createLab("" , "10 Holyoke Road", "Rockville Centre,", "NY",
            "11570", "jes418", "516", "6328925", true);
        assertEquals(lab3, null);
    }
    
    @Test
    public void testIsValidLab(){
        Boolean notValid = GUIController.isValidLab("" , "10 Holyoke Road", "Rockville Centre,", "NY",
            "11570", "jes418", "516", "6328925", true);
        assertFalse(notValid);
        
        Boolean valid = GUIController.isValidLab("Test" , "10 Holyoke Road", "Rockville Centre,", "NY",
            "11570", "jes418", "516", "6328925", true);
        assertTrue(valid);
        
        //NEED TO CHECK DBMANAGER CALLS
    }
    
    @After
    public void tearDown() {
    }

    
}
