import java.util.Scanner;

public class lab3_3_2{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a number to check it comes in fibonacci series or not");
       System.out.println("Enter the number: ");
       int num = scan.nextInt();
       
       double n1 = 5*(num)*(num) + 4 , n2 = 5*(num)*(num) - 4;
       double sq1 = Math.sqrt(n1), sq2 = Math.sqrt(n2);

       if (sq1 == Math.floor(sq1) || sq2 == Math.floor(sq2)) {
           System.out.println("Yes " + num + " comes in fibonacci series");
       } else {
            System.out.println("No " + num + " does not comes in fibonacci series");
       }

    }
}