import java.util.Scanner;

public class Exp5 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Array of 5 integers
        Scanner scanner = new Scanner(System.in);

        try {
            // Asking the user for an index
            System.out.print("Enter an index (0 to 4): ");
            int index = scanner.nextInt();

            // Attempt to access the array element
            System.out.println("Element at index " + index + " is: " + numbers[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Please enter a value between 0 and 4.");
        } finally {
            System.out.println("Array access attempted.");
            scanner.close();
        }
    }
}
