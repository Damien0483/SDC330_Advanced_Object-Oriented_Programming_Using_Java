The Employee Management System (EMS) is a console‑based application designed to demonstrate core object‑oriented programming principles including inheritance, composition, abstraction, and polymorphism. The system allows users to create, manage, update, and display different types of employees while maintaining clean separation of concerns and high cohesion across classes.
The attached System Design Document states that the system is built around a clear hierarchy where “Employee is the core abstraction” and derived classes extend its shared functionality.

Features
Add, update, and remove employees
Support for Hourly and Salaried employees
Polymorphic display of employee details
Composition through embedded Address objects
Centralized employee storage and retrieval
Demonstrates interface‑based abstraction

System Architecture
Class Structure
Your System Design Document defines the following classes:
Employee (Base Class) – shared fields and behaviors
HourlyEmployee (Derived Class) – hourly rate + hours worked
SalariedEmployee (Derived Class) – annual salary
Address (Composition Class) – street, city, state, zip
IPrintable (Interface) – polymorphic print behavior
EmployeeManager (Controller) – manages employee collection
App (Driver) – coordinates UI and system flow
The document notes:
“Employee HAS‑A Address… Address is a separate object used inside Employee.”
Inheritance
Both HourlyEmployee and SalariedEmployee inherit from Employee
Shared fields include: name, ID, address
Shared behaviors include: validation, formatting, printDetails()
Polymorphism
The design document states:
“A list of Employee objects can store both Hourly and Salaried employees… Calling printDetails() invokes the correct version.”
This is implemented through:
A polymorphic printDetails() method
A unified employee list in EmployeeManager
Composition
Each Employee contains an Address object
EmployeeManager contains a collection of Employee objects

Functional Capabilities
Employee (Base Class)
Stores name, ID, and address
Implements IPrintable
Provides shared formatting logic
HourlyEmployee
Adds hourlyRate and hoursWorked
Calculates weekly pay
Overrides printDetails()
SalariedEmployee
Adds annualSalary
Calculates monthly pay
Overrides printDetails()
Address
Stores street, city, state, zip
Provides formatted address output
EmployeeManager
Add employee
Remove employee
Update employee
Retrieve by type
Retrieve all employees
App
Displays welcome message
Instantiates objects
Demonstrates inheritance, composition, polymorphism
Coordinates user interaction

How to Run
Compile all .java files (or run via IDE)
Launch the App class
Follow the on‑screen menu to manage employees

Concepts Demonstrated
Inheritance
Polymorphism
Composition
Interfaces
Encapsulation
High cohesion / low coupling
The design document highlights these qualities as essential for maintainability and extensibility.
