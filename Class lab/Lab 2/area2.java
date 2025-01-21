import java.util.*;

 public class area2{
	 public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the sides of the triangle to calculate its area");
	 double S1 = scan.nextDouble();
	 double S2 = scan.nextDouble();
         double S3 = scan.nextDouble();
	 double S = S1 + S2 + S3 / 2;
	 S = S*(S - S1)*(S - S2)*(S - S3);
	 double area = Math.sqrt(S);
	 System.out.println("The area of the triangle with sides " + S1 + S2 + S3 + " is " + area);
   }
 } 
