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
public class AddressJUnitTest {
    
    public AddressJUnitTest() {
    }
    
    Address address;
    
    @Before
    public void setUp() {
        address = new Address("4 Farrington Square", "Bethlehem", "PA", "18015");
    }
    
    @Test
    public void testGetStreet(){
        assertEquals(address.getStreet(), "4 Farrington Square");
    }
    
    @Test
    public void testGetCity(){
        assertEquals(address.getCity(), "Bethlehem");
    }
    
    @Test
    public void testGetState(){
        assertEquals(address.getState(), "PA");
    }
    
    @Test
    public void testGetZip(){
        assertEquals(address.getZip(), "18015");
    } 
    
    @After
    public void tearDown() {
    }

   
}
