/**************************************************************************************
Name: Damien Harmon
Date: March 23, 2026
Assignment: SDC330L 2.4 Project Interfaces & Polymorphism
Description: SDC330L Advanced Object-Oriented Programming with Java
***************************************************************************************/

public class Employee implements IPrintable {

    protected String name;
    protected int id;
    protected Address address;   // COMPOSITION: Employee HAS-A Address

    public Employee(String name, int id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    @Override
    public void printDetails() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "\nEmployee ID: " + id +
               "\nName: " + name +
               "\nAddress: " + address;
    }
}
