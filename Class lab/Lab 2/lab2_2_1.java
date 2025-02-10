import java.util.*;

 public class lab2_2_1{
   public static void main(String[] args){
	   Scanner scan = new Scanner(System.in);
	   System.out.println("This is a program to calculate the simple interest");
	   System.out.println("Enter the principle: ");
	   double p = scan.nextDouble();
	   	System.out.println("Enter the rate: ");
	   double r = scan.nextDouble();
	   	System.out.println("Enter the time: ");
	   double t = scan.nextDouble();
	   double SI = p*r*t/100;
	   System.out.print("The simple interest is " + SI);

   }
 }
