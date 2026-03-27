/**************************************************************************************
Name: Damien Harmon
Date: March 23, 2026
Assignment: SDC330L 2.4 Project Interfaces & Polymorphism
Description: SDC330L Advanced Object-Oriented Programming with Java
***************************************************************************************/

public class App {

    public static void main(String[] args) {

        // Week 2 Indicator + Title + Name
        System.out.println("==============================================");
        System.out.println("           WEEK 2 PROJECT - INTERFACES");
        System.out.println("     Demonstrating Polymorphism & Abstraction");
        System.out.println("             Developer: Damien Harmon");
        System.out.println("==============================================\n");

        // Welcome message with information
        System.out.println("Welcome to the Week 2 demonstration!");
        System.out.println("This program will:");
        System.out.println("- Demonstrate interface creation");
        System.out.println("- Demonstrate polymorphism using IPrintable");
        System.out.println("- Instantiate objects with data");
        System.out.println("- Display all stored information\n");

        // COMPOSITION: Employee HAS-A Address
        Address addr1 = new Address("123 Main St", "Chesapeake", "VA", "23320");
        Address addr2 = new Address("900 Liberty Ave", "Norfolk", "VA", "23510");

        // INHERITANCE + POLYMORPHISM:
        // Both objects are treated as IPrintable
        IPrintable emp1 = new HourlyEmployee("John Doe", 101, addr1, 22.50, 40);
        IPrintable emp2 = new SalariedEmployee("Jane Smith", 102, addr2, 78000);

        // POLYMORPHISM: Same method call, different behavior
        System.out.println("\n--- Polymorphic Output ---");
        emp1.printDetails();
        emp2.printDetails();

        System.out.println("End of Week 2 demonstration. Thank you!");
    }
}
