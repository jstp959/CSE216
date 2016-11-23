/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamTests;

import ExamType.BusinessObjects.*;
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
public class ExamTypeJUnitTest {

    ExamType testExam; 
    
    /**
     * sets up the test ExamType
     */
    @Before
    public void setUp() {
        testExam = new ExamType("Test", "This Description");
    }
    
    @Test
   public void testGetName(){
       setUp();
       assertEquals(testExam.getName(), "Test");       
   }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
