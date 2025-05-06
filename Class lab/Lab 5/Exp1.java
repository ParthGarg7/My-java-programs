// Example usage

public class Exp1 {

    public static void main(String[] args) {
        // Using default constructor
        Student student1 = new Student();
        student1.displayDetails();

        // Using parameterized constructor
        Student student2 = new Student("Alice", 20);
        student2.displayDetails();
    }
}

class Student {

    String name;
    int age;

    // Default constructor
    Student() {
        this.name = "Default Name";
        this.age = 18;
    }

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
