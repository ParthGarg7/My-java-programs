import java.util.Scanner;

public class lab2_7{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Marks of 3 subjects: ");
        System.out.println("Enter Marks of Subject1: ");
        int num1 = scan.nextInt();
        System.out.println("Enter Marks of Subject2: ");
        int num2 = scan.nextInt();
        System.out.println("Enter Marks of Subject3: ");
        int num3 = scan.nextInt();
        int avg = num1 + num2 + num3 ;
        avg = avg /3;

        if (avg >= 90) 
            System.out.println("Grade A");
        else if (avg >= 75)
            System.out.println("Grade B");
        else if (avg >= 50)
            System.out.println("Grade C");
        else
            System.out.println("Grade F");


    }
}