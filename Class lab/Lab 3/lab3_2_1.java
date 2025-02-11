import java.util.Scanner;

  public class lab3_2_1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        System.out.println("You entered: " + num);
        int sum = 0 , a;
        int b = num;
        while (b > 0 ) { 
            a = b % 10;
            sum = sum + a ;
            b = b / 10 ;
        }

        System.out.println("The sum of digits of " + num + " is " + sum);
    }
  }