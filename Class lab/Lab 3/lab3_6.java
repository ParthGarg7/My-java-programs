import java.util.Scanner;
import java.util.Arrays;

public class lab3_6
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = scan.nextInt();

        int[] Array1 = new int[size];
 
        System.out.println("Enter the elements of the Array: ");
        for(int i = 0; i < Array1.length; i++)
          Array1[i] = scan.nextInt();
 
        int G1 = Array1[0];

        for(int x: Array1)
         G1 = G1 > x ? G1 : x;

        int G2 = Array1[0];

        for(int x: Array1)
        {
            if(x != G1)
            G2 = G2 > x ? G2 : x;
        }

        System.out.println("Enter Array is: " + Arrays.toString(Array1));
        System.out.println("Greatest Element is: " + G1);
        System.out.println("Second greatest Element is: " + G2);
    }
}