
import java.util.Arrays;
import java.util.Scanner;

public class lab3_5_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = scan.nextInt();

        int[] Array1 = new int[size];

        System.out.println("Enter the elements of the Array: ");
        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = scan.nextInt();
        }

        int[] Array2 = new int[size];

        int size2 = 0;
        for (int i = 0; i < size; i++) {
            // setting the flag to 0 every time
            int flag = 0;

            // checking if the element is present in the array or not 
            for (int y : Array2) {
                if (y == Array1[i]) {
                    flag = 1;
                }
            }

            //Passing the element in the array2 after checking
            if (flag == 0) {
                Array2[size2] = Array1[i];
                size2 += 1;
            }

        }

        System.out.println("Entered Array is: ");
        System.out.println(Arrays.toString(Array1));

        System.out.println("New Array is: ");
        for (int i = 0; i < size2; i++) {
            System.out.print(Array2[i] + " ");
        }
        System.out.println();
    }
}
