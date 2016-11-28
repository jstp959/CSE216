/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab.BusinessObjects;

/**
 *  Address represents a street address for a physical location.
 * 
 * @author owner
 */
public class Address implements Comparable<Address>{
    private final String street;
    private final String city;
    private final String state;
    private final String zip;

    /**
     * Constructor to create an Address.
     * 
     * @param street    Building number and street name
     * @param city      City
     * @param state     2-letter state abbreviation
     * @param zip       numeric 5-digit zip code
     */
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    /** 
     * Get street of an address
     * 
     * @return  building number and street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Get city of an address
     * 
     * @return  city of the address
     */
    public String getCity() {
        return city;
    }
    
    /**
     * Get state of an address
     * 
     * @return  2 letter abbreviation of state
     */
    public String getState() {
        return state;
    }

    /**
     * Get zip code of an address
     * 
     * @return  5 digit zip code
     */
    public String getZip() {
        return zip;
    }


    /**
     * Compare two addresses.
     * Considered the same if *all fields* match.
     * 
     * @param address  address to compare to this object 
     * @return          0 if the same, -1 o/w
     */
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
