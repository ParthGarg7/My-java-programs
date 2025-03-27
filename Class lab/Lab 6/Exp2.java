
import java.util.Scanner;

// Main Class to Run the Program
public class Exp2 {

    public static void main(String[] args) {

        // Creating Manager
        Manager m1 = new Manager("Devi singh", 40, 101, "Project Manager");
        m1.displayDetails();

        // Creating Developer
        Developer d1 = new Developer("rahul", 24, 102, "Software Developer");
        d1.displayDetails();

    }
}

// Abstract Class (Base Class)
abstract class Employee {

    String name;
    int age;
    double salary;
    int ID;
    String position;

    abstract public void calculateSalary();

    abstract public void displayDetails();
}

// Manager Class (Fixed Monthly Salary)
class Manager extends Employee {

    private double monthlyWages = 156700.89;

    // Constructor
    Manager(String name, int age, int ID, String position) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.position = position;
    }

    @Override
    public void calculateSalary() {
        salary = monthlyWages;  // Fixed salary
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Yearly Salary: " + (salary * 12));
    }

    @Override
    public void displayDetails() {
        System.out.println();
        System.out.println("Position: " + position);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + ID);
        System.out.println("Salary: ");
        calculateSalary();
    }
}

// Developer Class (Hourly Wage System)
class Developer extends Employee {

    private int hourlyWage = 1000;
    Scanner scan = new Scanner(System.in);

    // Constructor
    Developer(String name, int age, int ID, String position) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.position = position;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Enter hours worked since last payment: ");
        int hoursWorked = scan.nextInt();
        salary = hoursWorked * hourlyWage;  // Correct salary calculation
        System.out.println("Your salary for " + hoursWorked + " hours is " + salary);
        scan.close (); // Close scanner at the end
    }

    @Override
    public void displayDetails() {
        System.out.println();
        System.out.println("Position: " + position);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + ID);
        System.out.println("Salary: ");
        calculateSalary();
    }


}
