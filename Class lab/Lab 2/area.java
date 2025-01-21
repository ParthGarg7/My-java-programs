import java.util.Scanner;

public class area{
 public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   System.out.printf("Enter the height and base of the triangle\n");
   double height = scan.nextDouble();
   double base = scan.nextDouble();
   double area = height * base / 2;
   System.out.printf("The area of the triangle is %f " ,area);
  }
}