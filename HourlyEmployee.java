/**************************************************************************************
Name: Damien Harmon
Date: March 23, 2026
Assignment: SDC330L 2.4 Project Interfaces & Polymorphism
Description: SDC330L Advanced Object-Oriented Programming with Java
***************************************************************************************/

public class HourlyEmployee extends Employee {

    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int id, Address address,
                          double hourlyRate, int hoursWorked) {
        super(name, id, address);  // INHERITANCE
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nType: Hourly Employee" +
               "\nHourly Rate: $" + hourlyRate +
               "\nHours Worked: " + hoursWorked + "\n";
    }
}
