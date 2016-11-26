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
public class Lab implements Comparable<Lab> {

    private String name;
    private Address address;
    private String email;
    private String faxNo;
    private String phoneNo;
    private Boolean onSite;

    public Lab(String name, String street, String city, String state, String zip, String email, String faxNo, String phoneNo, Boolean onSite) {
        this.name = name;
        this.address = new Address(street, city, state, zip);
        this.email = email;
        this.faxNo = faxNo;
        this.phoneNo = phoneNo;
        this.onSite = onSite;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getFaxNo() {
        return faxNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public Boolean getOnSite() {
        return onSite;
    }

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
