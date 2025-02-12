import java.util.Scanner;
import java.util.Arrays;

public class lab3_8
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
        
        int[] Array2 = new int[size];
 
        for(int i = 0 ;i < size; i++)
             Array2[i] = Array1[i];

        System.out.println("Entered Array is: ");
        System.out.println(Arrays.toString(Array1));

        System.out.println("New Array is: ");
        System.out.println(Arrays.toString(Array2));

    }
}