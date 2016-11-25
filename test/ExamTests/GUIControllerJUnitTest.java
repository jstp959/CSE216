/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamTests;

import ExamType.BusinessObjects.*;
import ExamType.Controller.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author owner
 */
public class GUIControllerJUnitTest {
    
    User admin;
    User noAdmin;
    ExamType nullExam;
    ExamType exam;
    
    @Before
    public void setUp() {
        admin = new User("testID", "testPassword", "admin");
        noAdmin = new User("testID", "testPassword", "staff");
        nullExam = new ExamType("", "");
        exam = new ExamType("Colonoscopy", "Ouch");
    }
    
    @Test
    public void testCheckPrivilege(){
        assertEquals(admin.getPrivilege(), "admin");
        assertEquals(GUIController.checkPrivilege(admin), true);
        assertEquals(GUIController.checkPrivilege(noAdmin), false);
    }

    @Test
    public void testCreateExamType(){
        assertEquals(GUIController.createExamType("","Irrelevant"),  null);
        assertEquals((GUIController.createExamType("Colonoscopy", "Ouch")).compareTo(exam), 0);        
    }
    
    @Test
    public void testAddExamType(){
        String testResult = GUIController.addExamType("", "");
        assertEquals(testResult, "Error: Exam Type requires a name");
        
        //*****NEED TO CHECK WHEN CALLS TO DBMANAGER*****
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
