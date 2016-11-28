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

    @Before
    public void setUp() {
        conn = DBManager.connector();
        e1 = new ExamType("test", "blahblah");
        e2 = new ExamType("123451234512345twentyplus", "blahblah");
        e3 = new ExamType("black", "twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_");
        e4 = new ExamType("bobo", "");
        e5 = new ExamType("", "blahblah");
        e6 = new ExamType("newTests", "blahblah");
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
    public void testSaveLab() {
        setUp();
        String testMsg;
        ArrayList<ExamType> labs = new ArrayList<>();
        labs.add(e1);
        labs.add(e2);
        labs.add(e3);
        labs.add(e4);
        labs.add(e5);
        labs.add(e6);
        ArrayList<String> msgs = new ArrayList<>();
        msgs.add("Error: Update Failed (Contact developers): Duplicate entry 'test' for key 'PRIMARY'");//1
        msgs.add("Error: 123451234512345twentyplus has a length not in [1, 20]");//2
        msgs.add("Error: twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_twenty_letters_here_!_ has a length not in [0, 200]");//3
        msgs.add("Exam Type \"" + e4.getName() + "\" Added");//4
        msgs.add("Error:  has a length not in [1, 20]");//5
        msgs.add("Exam Type \"" + e6.getName() + "\" Added");//6
        for (int i = 0; i < labs.size(); i++) {
            testMsg = DBManager.saveExamType(labs.get(i));
            assertEquals(testMsg, msgs.get(i));
        }
        assertTrue(DBManager.delete(e4.getName()));
        assertTrue(DBManager.delete(e6.getName()));
    }

    @After
    public void tearDown() {
        DBManager.closer();
    }
}
