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
        assertEquals(l.getOnSite(), true);
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
