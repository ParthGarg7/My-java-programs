
import java.util.*;

public class SimpleCal {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int num1 = scan.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = scan.nextInt();
        System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
        System.out.println("Division of " + num1 + " and " + num2 + " is " + (num1 / num2));
    }
}
