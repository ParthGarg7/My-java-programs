import java.util.*;

 public class SI1{
   public static void main(String[] args){
	   Scanner scan = new Scanner(System.in);
	   System.out.println("This is a program to calculate the simple intrest");
	   System.out.println("Enter the principal , rate and time");
	   double p = scan.nextDouble();
	   double r = scan.nextDouble();
	   double t = scan.nextDouble();
	   double SI = p*r*t/100;
	   System.out.print("The simple intrest is " + SI);

   }
 }
