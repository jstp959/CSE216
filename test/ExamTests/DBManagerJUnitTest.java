/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamTests;

import ExamType.BusinessObjects.ExamType;
import ExamType.DBManager.DBManager;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *  Test class for ExamType classes/methods.
 * 
 * @author owner
 */
public class DBManagerJUnitTest {

    Boolean conn;
    ExamType e1, e2, e3, e4, e5, e6;
    ArrayList<ExamType> examtypes;
    
    @Before
    public void setUp() {
        conn = DBManager.connector();
        e1 = new ExamType("Open gastric biopsy", "");
        e2 = new ExamType("123451234512345twentyplusBUT_ACTUALLY40now123451234512345", "blahblah");
        e3 = new ExamType("black", "twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_");
        e4 = new ExamType("bobo", "");
        e5 = new ExamType("", "blahblah");
        e6 = new ExamType("newTests", "blahblah");
        examtypes = new ArrayList<>();
        examtypes.add(e1);
        examtypes.add(e2);
        examtypes.add(e3);
        examtypes.add(e4);
        examtypes.add(e5);
        examtypes.add(e6);
    }

    @Test
    public void testConnector() {
        setUp();
        assertTrue(conn);
    }

    @Test
    public void testCheckUnique() {
        setUp();
        assertTrue(DBManager.checkUnique(e6));
        assertFalse(DBManager.checkUnique(e1));
    }

    @Test
    public void testSaveExamType() {
        setUp();
        String testMsg;
        ArrayList<String> msgs = new ArrayList<>();
        msgs.add("Error: Update Failed (Contact developers): Duplicate entry 'Open gastric biopsy' for key 'PRIMARY'");//1
        msgs.add("Error: 123451234512345twentyplusBUT_ACTUALLY40now123451234512345 has a length not in [1, 40]");//2
        msgs.add("Error: twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_ has a length not in [0, 200]");//3
        msgs.add("Exam Type \"" + e4.getName() + "\" Added");//4
        msgs.add("Error:  has a length not in [1, 40]");//5
        msgs.add("Exam Type \"" + e6.getName() + "\" Added");//6
        for (int i = 0; i < examtypes.size(); i++) {
            testMsg = DBManager.saveExamType(examtypes.get(i));
            assertEquals(testMsg, msgs.get(i));
        }
        assertTrue(DBManager.delete(e4.getName()));
        assertTrue(DBManager.delete(e6.getName()));
    }

    @Test
    public void testGetAllExams(){
        //setUp();
        ArrayList<ExamType> exams = DBManager.getAllExamTypes();
        assertNotNull(exams);
        Boolean name = false;
        for (ExamType e: exams) {
            name |= e.getName().equals(e1.getName());
        }
        assertTrue(name);
    }
    
    @Test
    public void testUpdateExamType(){
        setUp();
        String testMsg;
        String oldDesc;
        ArrayList<String> msgs = new ArrayList<>();
        msgs.add("Exam Type \"Open gastric biopsy\" Updated");//1
        msgs.add("Error: 123451234512345twentyplusBUT_ACTUALLY40now123451234512345 has a length not in [1, 40]");//2
        msgs.add("Error: No Exam Type with name \""+e3.getName()+"\" so no changes made");//3
        msgs.add("Error: No Exam Type with name \""+e4.getName()+"\" so no changes made");//4
        msgs.add("Error:  has a length not in [1, 40]");//5
        msgs.add("Error: No Exam Type with name \""+e6.getName()+"\" so no changes made");//6
        //TODO: fix error messaging ... I dont know what to expected
        for (int i = 0; i < examtypes.size(); i++) {
            oldDesc = examtypes.get(i).getDescription();
            examtypes.get(i).setDescription("testing");
            testMsg = DBManager.updateExamType(examtypes.get(i), "Updated");
            assertEquals(testMsg, msgs.get(i));   
            examtypes.get(i).setDescription(oldDesc);
        }
        DBManager.updateExamType(examtypes.get(1), "Updated");
        
    }

    @After
    public void tearDown() {
        DBManager.closer();
    }
}
