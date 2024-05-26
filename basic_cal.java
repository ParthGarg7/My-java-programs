import java.util.*;

public class basic_cal{
    public static void main(String[] args){
        Scanner ScanInput = new Scanner(System.in);
      
        System.out.print("Enter first number: ");
        int num1 = ScanInput.nextInt();
        System.out.print("Enter second number: ");
        int num2 = ScanInput.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        int div = num1 / num2;

        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
        System.out.println("difference of " + num1 + " and " + num2 + " is " + diff);
        System.out.println("product of " + num1 + " and " + num2 + " is " + product);
        System.out.println("division of " + num1 + " and " + num2 + " is " + div);
    }
}