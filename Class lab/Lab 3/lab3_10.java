import java.util.Scanner;

public class lab3_10{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = scan.nextInt();
        int[] Array1 = new int[size];

        for(int i = 0 ; i < Array1.length; i++){
            System.out.println("Enter the element " + (i+1) + ": ");
            Array1[i] = scan.nextInt();
        }

        System.out.println("By how may positions you want to rotate the array right?");
        int rotate = scan.nextInt();

        rotate = rotate % size;

        int[] Array2 = new int[size];

        for (int i = 0; i < Array1.length; i++) 
            Array2[(i + rotate) % size] = Array1[i];
        

        for (var x: Array1) 
            System.out.print(x + " ");
        System.out.println();

        
        for (var x: Array2) 
            System.out.print(x + " ");
        System.out.println();
    }
}