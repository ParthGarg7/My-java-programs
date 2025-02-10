import java.util.Scanner;

public class lab2_5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        System.out.println("Enter number1: ");
        int num1 = scan.nextInt();
        System.out.println("Enter number2: ");
        int num2 = scan.nextInt();
        System.out.println("Enter number3: ");
        int num3 = scan.nextInt();

        if (num1 >= num2 && num1 >= num3) 
            System.out.println(num1 + " is greatest");
        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2 + " is greatest");
        else 
            System.out.println(num3 + " is greatest");

    }
}