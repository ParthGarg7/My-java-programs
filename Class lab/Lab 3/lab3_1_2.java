import  java.util.Scanner;

public class lab3_1_2{
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter 2 numbers: ");
     System.out.println("Enter number1: ");
     int num1 = scan.nextInt();
     System.out.println("Enter number2: ");
     int num2 = scan.nextInt();
     int num3 = num1 < num2? num1 : num2;
     int product = num1*num2;
     int hcf = 1;
     for (int i = 1; i <= num3; i++) {
        if (num1 % i == 0 && num2 % i == 0) {
            hcf = i;
            }
        }

     int lcm = product / hcf;

     System.out.printf("The HCF and LCM of %d and %d is %d and %d\n",num1,num2,hcf,lcm);
    }
      
}