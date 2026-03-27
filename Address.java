/**************************************************************************************
Name: Damien Harmon
Date: March 23, 2026
Assignment: SDC330L 2.4 Project Interfaces & Polymorphism
Description: SDC330L Advanced Object-Oriented Programming with Java
***************************************************************************************/

public class Address {

    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zip;
    }
}
