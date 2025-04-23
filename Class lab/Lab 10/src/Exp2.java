import java.util.ArrayList;
import java.util.Iterator;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: ₹" + salary);
    }
}

public class Exp2 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // Add 3 employees
        employees.add(new Employee("Aman", 101, 50000));
        employees.add(new Employee("Parul", 102, 55000));
        employees.add(new Employee("Ravi", 103, 60000));

        // Update salary of employee with ID 102
        for (Employee emp : employees) {
            if (emp.getId() == 102) {
                emp.setSalary(58000);
                System.out.println("Updated salary of ID 102 to ₹58000");
            }
        }

        // Remove employee with ID 101
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == 101) {
                iterator.remove();
                System.out.println("Removed employee with ID 101");
            }
        }

        // Display remaining employees
        System.out.println("\nRemaining employees:");
        for (Employee emp : employees) {
            emp.display();
        }
    }
}
