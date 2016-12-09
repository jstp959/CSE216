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
    ExamType exam2;
    
    @Before
    public void setUp() {
        admin = new User("testID", "testPassword", "admin");
        noAdmin = new User("testID", "testPassword", "staff");
        nullExam = new ExamType("", "");
        exam = new ExamType("Colonoscopy", "Ouch");
        exam2 = new ExamType("Blood test", "");
        exam2.setStatus(true);
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
        
        testResult = GUIController.addExamType("Colonoscopy", "Ouch");
        assertEquals(testResult, "Error: Exam Type with name \"Colonoscopy\" already exists");
        
    }
   
    @Test
    public void testUpdateExamType() {
        GUIController.addExamType("Blood test", "");
        
        //simulate having an exam type selected by using same name 
        //in function call
        String result = GUIController.updateExamType("Blood test", "new desc");
        assertEquals(result, "Exam Type \"Blood test\" Updated");
        
        result = GUIController.updateExamType("", "");
        assertEquals(result, "Error: Exam Type requires a name");
    }
    
    @Test
    public void testDeactivate() {
        assertEquals(exam2.getStatus(), true);
        String result = GUIController.deActivate(exam2);
        assertEquals(exam2.getStatus(), false);
    }
}
