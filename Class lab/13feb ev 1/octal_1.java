
import java.util.Scanner;

 public class octal_1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(args[0]);
        int Octal1 = intToOctal(num1);

        System.out.println("Enter the number to convert in octal: ");
        int num2 = scan.nextInt();
        int Octal2 = intToOctal(num2);

        System.out.println("Octal of " + num1 + " is " + Octal1);
        System.out.println("Octal of " + num2 + " is " + Octal2);
    }

     static int intToOctal(int num){

        int rem , div = 1 , octal = 0;

        while (div > 0) { 
        rem = num % 8;
        div = num / 8;
        octal = octal* 10 + rem; 
        num = div;
        }

        octal = reverse(octal);

        return octal;
     }

      static int reverse(int num){
        int rev = 0;
        while(num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
            }
            return rev;
      }
 }