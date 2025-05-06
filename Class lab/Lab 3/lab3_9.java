
import java.util.Scanner;

public class lab3_9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = scan.nextInt();
        int[] Array1 = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element: " + (i + 1));
            Array1[i] = scan.nextInt();
        }
        int sumOfN = size * (size + 1) / 2; // Sum of first N natural numbers
        int sumOfArray = 0;

        for (int i = 0; i < size - 1; i++) {
            sumOfArray += Array1[i];
        }

        int missingNumber = sumOfN - sumOfArray;
        System.out.println("The missing number is: " + missingNumber);
    }
}
