/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabTests;

import Lab.BusinessObjects.Lab;
import Lab.DBManager.DBManager;
import java.util.ArrayList;
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
public class DBManagerJUnitTest {

    Boolean conn;
    Lab l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    ArrayList<Lab> labs;
    
    @Before
    public void setUp() {
        conn = DBManager.connector();
        l1 = new Lab("Test23", "10 Holyoke Road", "Rockville Centre,", "NY",
                "11570", "jes418@lehigh.edu", "9148884040", "9148884030", true);
        l2 = new Lab("lab", "1286 2nd Avenue", "Rockville Centre,", "NY",
                "11570", "jes418@lehigh.edu", "9148884040", "9148884030", true);
        l3 = new Lab("labbelabbelabbelabbelabbe", "1286 2nd Avenue", "Rockville Centre,", "NY",
                "11570", "jes418@lehigh.edu", "9148884040", "9148884030", true);
        l4 = new Lab("lab", "1286 2nd Avenue", "Rockville Centre,", "NY0",
                "11570", "jes418@lehigh.edu", "9148884040", "9148884030", true);
        l5 = new Lab("lab", "1286 2nd Avenue", "Rockville Centre,", "NY",
                "115870", "jes418@lehigh.edu", "9148884040", "9148884030", true);
        l6 = new Lab("lab", "1286 2nd Avenue", "Rockville Centre,", "NY",
                "-110", "jes418@lehigh.edu", "9148884040", "9148884030", true);
        l7 = new Lab("lab", "1286 2nd Avenue", "Rockville Centre,", "NY",
                "kasfdaf", "jes418@lehigh.edu", "9148884040", "9148884030", true);
        l8 = new Lab("lab", "1286 2nd Avenue", "Rockville Centre,", "NY",
                "11570", "jes418", "9148884040", "9148884030", true);
        l9 = new Lab("lab", "1286 2nd Avenue", "Rockville Centre,", "NY",
                "11570", "jes418@lehigh.edu", "9148884040999", "9148884030", true);
        l10 = new Lab("lab", "1286 2nd Avenue", "Rockville Centre,", "NY",
                "11570", "jes418@lehigh.edu", "9148884040", "914888", true);
        labs = new ArrayList<>();
        labs.add(l1);
        labs.add(l2);
        labs.add(l3);
        labs.add(l4);
        labs.add(l5);
        labs.add(l6);
        labs.add(l7);
        labs.add(l8);
        labs.add(l9);
        labs.add(l10);
    }

    @Test
    public void testConnector() {
        setUp();
        assertTrue(conn);
    }

    @Test
    public void testCheckUnique() {
        setUp();
        assertTrue(DBManager.checkUnique(l1));
        assertFalse(DBManager.checkUnique(l2));
    }

    @Test
    public void testSaveLab() {
        setUp();
        String testMsg;
        ArrayList<String> msgs = new ArrayList<>();
        msgs.add("Lab \"" + l1.getName() + "\" Added");//1
        msgs.add("Error: Update Failed (Contact developers): Duplicate entry 'lab-1286 2nd Avenue' for key 'PRIMARY'");//2
        msgs.add("Error: labbelabbelabbelabbelabbe has a length not in [0, 20]");//3
        msgs.add("Error: NY0 has a length not in [2, 2]");//4
        msgs.add("Error: 115870 not in valid range: [501, 99950]");//5
        msgs.add("Error: -110 not in valid range: [501, 99950]");//6
        msgs.add("Error: kasfdaf cannot be parsed to a number");//7
        msgs.add("Error: jes418 does not have @ in it");//8
        msgs.add("Error: 9148884040999 not in valid range: [1000000000, 9999999999]");//9
        msgs.add("Error: 914888 not in valid range: [1000000000, 9999999999]");//10
        for (int i = 0; i < labs.size(); i++) {
            testMsg = DBManager.saveLab(labs.get(i));
            assertEquals(testMsg, msgs.get(i));
        }
        assertTrue(DBManager.delete(l1.getName(), l1.getAddress().getStreet()));
    }
    
    
    @Test
    public void testGetAllExams(){
        //setUp();
        ArrayList<Lab> labList = DBManager.getAllLabs();
        assertNotNull(labList);
        Boolean name = false;
        Boolean street = false;
        for (Lab l: labList) {
            name |= l.getName().equals(l2.getName());
            street = l.getAddress().getStreet().equals(l2.getAddress().getStreet()); 
        }
        assertTrue(name); 
        assertTrue(street);
    }
    
    @Test
    public void testUpdateExamType(){
        setUp();
        String testMsg;
        String oldEmail;
        ArrayList<String> msgs = new ArrayList<>();
        msgs.add("Error: No Lab with name \"" + l1.getName() + "\" so no changes made");//1
        msgs.add("Error: No Lab with name \"" + l2.getName() + "\" so no changes made");//2
        msgs.add("Error: labbelabbelabbelabbelabbe has a length not in [0, 20]");//3
        msgs.add("Error: NY0 has a length not in [2, 2]");//4
        msgs.add("Error: 115870 not in valid range: [501, 99950]");//5
        msgs.add("Error: -110 not in valid range: [501, 99950]");//6
        msgs.add("Error: kasfdaf cannot be parsed to a number");//7
        msgs.add("Error: No Lab with name \"" + l8.getName() + "\" so no changes made");//8
        msgs.add("Error: 9148884040999 not in valid range: [1000000000, 9999999999]");//9
        msgs.add("Error: 914888 not in valid range: [1000000000, 9999999999]");//10
        for (int i = 0; i < labs.size(); i++) {
            oldEmail = labs.get(i).getEmail();
            labs.get(i).setEmail("new@blah.com");
            testMsg = DBManager.updateLab(labs.get(i));
            assertEquals(testMsg, msgs.get(i));   
            labs.get(i).setEmail(oldEmail);
        }
        DBManager.updateLab(labs.get(1));
        
    }

    @After
    public void tearDown() {
        DBManager.closer();
    }

}
