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
    
    User testUser;
    ExamType nullExam;
    
    @Before
    public void setUp() {
        testUser = new User("testID", "testPassword", "testPrivilege");
        nullExam = new ExamType("", "");
    }
    
    @Test
    public void testCheckPrivilege(){
        setUp();
        assertEquals(testUser.getPrivilege(), "testPrivilege");
    }

    @Test
    public void testCreateExamType(){
        setUp();
        ExamType testExam2 = GUIController.createExamType("", "testDesc");
        assertEquals(testExam2,  null);
    }
    
    @Test
    public void testAddExamType(){
        setUp();
        String testResult = GUIController.addExamType("", "");
        assertEquals(testResult, "Error: Exam Type requires a name");
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
