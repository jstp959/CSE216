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
public class Address implements Comparable<Address>{
    private final String street;
    private final String city;
    private final String state;
    private final String zip;

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }
    
    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }


    @Override
    public int compareTo(Address address) {
        if (this.street.equals(address.getStreet())
                && this.city.equals(address.getCity())
                && this.state.equals(address.getState())
                && this.zip.equals(address.getZip())) {
            return 0;
        } else {
            return -1;
        }
    }
    
    
    
}
