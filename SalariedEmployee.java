/**************************************************************************************
Name: Damien Harmon
Date: March 23, 2026
Assignment: SDC330L 2.4 Project Interfaces & Polymorphism
Description: SDC330L Advanced Object-Oriented Programming with Java
***************************************************************************************/

public class SalariedEmployee extends Employee {

    private double annualSalary;

    public SalariedEmployee(String name, int id, Address address,
                            double annualSalary) {
        super(name, id, address);  // INHERITANCE
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nType: Salaried Employee" +
               "\nAnnual Salary: $" + annualSalary + "\n";
    }
}
