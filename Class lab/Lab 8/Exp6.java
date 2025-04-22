import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exp6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking input from the user
            System.out.print("Enter student's name: ");
            String name = scanner.nextLine();

            System.out.print("Enter roll number: ");
            String rollNumber = scanner.nextLine();

            System.out.print("Enter grade: ");
            String grade = scanner.nextLine();

            // Writing to the file in append mode
            FileWriter writer = new FileWriter("student.txt", true);
            writer.write("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n");
            writer.close();

            System.out.println("Student information saved successfully.");

        } catch (IOException e) {
            System.out.println("Error: Unable to write to file.");
            e.printStackTrace(); // Optional: to show detailed error
        } finally {
            scanner.close();
        }
    }
}
