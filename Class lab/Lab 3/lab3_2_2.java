import java.util.Scanner;

  public class lab3_2_2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        System.out.println("You entered: " + num);
        int rev = 0 , a , b;
        a = num;
        while (a > 0 ) { 
            b = a % 10;
            rev = b + rev * 10;    
            a = a / 10 ;
        }

        System.out.println("The reverse of " + num + " is " + rev);
    }
  }