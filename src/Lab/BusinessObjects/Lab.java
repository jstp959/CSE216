/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab.BusinessObjects;

/**
 *  Lab object represents a physical lab location.
 * Labs are utilized by hospital for testing, etc.
 * 
 * @author Elise
 */
public class Lab implements Comparable<Lab> {

    private String name;
    private Address address;
    private String email;
    private String faxNo;
    private String phoneNo;
    private Boolean onSite;

    /**
     * Constructor.
     * 
     * @param name      Lab's name
     * @param street    street address
     * @param city      city
     * @param state     2 letter state abbreviation
     * @param zip       5 digit zip code
     * @param email     email contact information
     * @param faxNo      fax number
     * @param phoneNo    phone number
     * @param onSite    whether or not the lab is on-site (relative to hospital)
     */
    public Lab(String name, String street, String city, String state, String zip, String email, String faxNo, String phoneNo, Boolean onSite) {
        this.name = name;
        this.address = new Address(street, city, state, zip);
        this.email = email;
        this.faxNo = faxNo;
        this.phoneNo = phoneNo;
        this.onSite = onSite;
    }

    /**
     * Get name of lab
     * @return  name
     */
    public String getName() {
        return name;
    }

    /**
     * Get address of lab
     * @return  address object containing address information
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Set email
     * @return  email
     */
    public void setEmail(String e) {
        this.email = e;
    }
    
    /**
     * Get email
     * @return  email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Get fax number
     * @return fax number
     */
    public String getFaxNo() {
        return faxNo;
    }

    /**
     * Get phone number
     * @return phone number
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * Get whether lab is on-site
     * @return  true if on-site, false if not
     */
    public Boolean getOnSite() {
        return onSite;
    }

    /**
     * Compare two lab objects.
     * Labs are the same if they share the same name and address.
     * 
     * @param lab   lab object to compare to this one
     * @return      o if they are the same, -1 o/w
     */
    @Override
    public int compareTo(Lab lab) {
        if (!this.name.equals(lab.getName())
                || !this.address.getStreet().equals(lab.getAddress().getStreet())) {
            return -1;
        } else {
            return 0;
        }
    }

}
