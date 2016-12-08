/*
 * JUnit tests for the method in the ExamType class
 * 
 */
package ExamTests;

import ExamType.BusinessObjects.*;
import java.util.HashSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author John St. Pierre, Ferguson Watkins
 * @version Nov 22, 2016
 */
public class ExamTypeJUnitTest {

    ExamType testExam, testExamClone, nullTest;

    /**
     * sets up the test ExamType
     */
    @Before
    public void setUp() {
        testExam = new ExamType("Test", "This Description");
        testExamClone = new ExamType("Test", "This Description");
        nullTest = new ExamType("", "");
    }

    @Test
    public void testGetName() {
        setUp();
        assertEquals(testExam.getName(), "Test");
        assertEquals(nullTest.getName(), "");
    }
    
    @Test
    public void testGetDescription(){
        setUp();
        assertEquals(testExam.getDescription(), "This Description");
        assertEquals(nullTest.getDescription(), "");

    }
    
    @Test
    public void testGetStatus() {
        setUp();
        assertEquals(testExam.getStatus(), true);
        assertEquals(nullTest.getName(), "");

    }
    
    @Test
    public void testSetName() {
        setUp();
        testExam.setName("Name1");
        assertEquals(testExam.getName(), "Name1");
    }
    
    @Test
    public void testSetDescription(){
        setUp();
        testExam.setDescription("Desc1");
        assertEquals(testExam.getDescription(),"Desc1");
    }
    
    @Test
    public void testSetStatus() {
        setUp();
        assertEquals(nullTest.getStatus(), true);
        nullTest.setStatus(false);
        assertEquals(nullTest.getStatus(), false);
    }
    
    @Test
    public void testCompareTo(){
        setUp();
        assertEquals(testExam.compareTo(testExamClone), 0);
        assertEquals(testExam.compareTo(nullTest), -1);
    }

}
