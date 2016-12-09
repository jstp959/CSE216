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

/**
 *
 * @author owner
 */
public class LabJUnitTest {
    
    Lab l;
    
    @Before
    public void setUp() {
        l = new Lab("Test" , "10 Holyoke Road", "Rockville Centre,", "NY",
            "11570", "jes418", "516", "6328925", true);
        
    }
    
    @Test
    public void testGetName(){
        assertEquals(l.getName(), "Test");
    }
    
    @Test
    public void testGetAddress(){
        Address address1 = new Address("10 Holyoke Road", "Rockville Centre,", "NY",
            "11570");
        Address address2 = new Address("Fail", "Rockville Centre,", "NY",
            "11570");
        assertEquals(address1.compareTo(l.getAddress()), 0);
        assertEquals(address2.compareTo(l.getAddress()), -1);
    }
    
    @Test
    public void testGetEmail(){
        assertEquals(l.getEmail(), "jes418");
    }
    
    @Test
    public void testGetFaxNo(){
        assertEquals(l.getFaxNo(), "516");
    }
    
    @Test
    public void testGetPhoneNo(){
        assertEquals(l.getPhoneNo(), "6328925");
    }
    
    @Test
    public void testGetOnSite(){
        assertTrue(l.getOnSite());
    }
    
        
    @Test
    public void testSetName(){
        l.setName("new");
        assertEquals(l.getName(), "new");
    }
    
    @Test
    public void testSetAddress(){
        Address address1 = new Address("10 Holyoke Road", "Rockville Centre,", "NY",
            "11570");
        Address address2 = new Address("Fail", "Rockville Centre,", "NY",
            "11570");
        l.setAddress(address2);
        assertEquals(address1.compareTo(l.getAddress()), -1);
        assertEquals(address2.compareTo(l.getAddress()), 0);
    }
    
    @Test
    public void testSetEmail(){
        l.setEmail("new@gmail.com");
        assertEquals(l.getEmail(), "new@gmail.com");
    }
    
    @Test
    public void testSetFaxNo(){
        l.setFaxNo("8882221111");
        assertEquals(l.getFaxNo(), "8882221111");
    }
    
    @Test
    public void testSetPhoneNo(){
        l.setPhoneNo("8882221111");
        assertEquals(l.getPhoneNo(), "8882221111");
    }
    
    @Test
    public void testSetOnSite(){
        l.setOnSite(false);
        assertFalse(l.getOnSite());
    }
    
    @Test
    public void testCompareTo(){
        assertEquals(l.compareTo(l), 0);
        Lab lab2 = new Lab("Test" , "10 Holyoke Road", "Rockville Centre,", "NY",
            "11570", "jes418", "516", "6328925", true);
        assertEquals(l.compareTo(lab2), 0);
        
        Lab lab3 = new Lab("Fail" , "10 Holyoke Road", "Rockville Centre,", "NY",
            "11570", "jes418", "516", "6328925", true);
        assertEquals(l.compareTo(lab3), -1);
    }
    
    
    
    
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
