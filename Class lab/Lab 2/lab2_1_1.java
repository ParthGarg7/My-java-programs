import java.util.Scanner;

public class lab2_1_1{
 public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   System.out.printf("Enter the height and base of the triangle\n");
   System.out.println("Enter the height: ");
   double height = scan.nextDouble();
   System.out.println("Enter the Base: ");
   double base = scan.nextDouble();
   double area = height * base / 2;
   System.out.printf("The area of the triangle is %f " ,area);
  }
}