/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab.BusinessObjects;

/**
 *
 * @author owner
 */
public class Address {
    private String street;
    private String city;
    private String state;
    private int zip;

    public Address(String street, String city, String state, int zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
   
}
