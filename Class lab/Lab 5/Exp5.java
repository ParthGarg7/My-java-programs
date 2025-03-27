// Test program (Main class)

public class Exp5 {

    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp1 = new Employee("Johny lala", 101, 50000);
        System.out.println("\nBefore Salary Increase:");
        emp1.display();

        // Increasing salary
        emp1.increaseSalary(10); // Increase salary by 10%
        System.out.println("\nAfter 10% Salary Increase:");
        emp1.display();

        // Creating a Manager object
        Manager mgr1 = new Manager("chouhan shab", 201, 70000, "IT");
        System.out.println("\nManager Details:");
        mgr1.display();

        // Increasing manager's salary
        mgr1.increaseSalary(15); // Increase salary by 15%
        System.out.println("\nAfter 15% Salary Increase:");
        mgr1.display();
    }
}

// Base class Employee
class Employee {

    protected String name;
    protected int empid;
    protected double salary;

    // Default constructor
    public Employee() {
        this.name = "Unknown";
        this.empid = 0;
        this.salary = 0.0;
    }

    // Parameterized constructor
    public Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Method to increase salary
    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        } else {
            System.out.println("Invalid percentage! Salary increase must be positive.");
        }
    }

    // Display employee details
    public void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Subclass Manager
class Manager extends Employee {

    private String department;

    // Parameterized constructor for Manager
    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Override display method to include department
    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}
