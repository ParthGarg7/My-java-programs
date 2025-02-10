import java.util.*;

 public class lab2_1_2{
	 public static void main(String[] args)
	 {
      Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the sides of the triangle to calculate its area");
	  System.out.println("Enter side 1:");
	  double S1 = scan.nextDouble();
	  System.out.println("Enter side 2:");
	  double S2 = scan.nextDouble();
	  System.out.println("Enter side 3:");
      double S3 = scan.nextDouble();
	  double S = S1 + S2 + S3 / 2;
	  S = S*(S - S1)*(S - S2)*(S - S3);
	  double area = Math.sqrt(S);
	  System.out.println("The area of the triangle with sides " + S1 + S2 + S3 + " is " + area);
   }
 } 
