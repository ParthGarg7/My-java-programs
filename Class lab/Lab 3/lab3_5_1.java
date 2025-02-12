import java.util.Scanner;

public class lab3_5_1{
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = scan.nextInt();
        int[] Array1 = new int[size];
        System.out.println("Enter the elements of thr Array: ");
        for(int i = 0; i < size ; i++){
           System.out.println("Enter element " + (i+1) + ": ");
           Array1[i] = scan.nextInt();
        }
        System.out.println("Entered Array is: ");
        for(int x: Array1)
            System.out.print(x + " ");
        
        System.out.println();
        System.out.println("Enter the target you want to find in the Array: ");
        int target = scan.nextInt();
        int count = 0;
        for(int x: Array1){
            if(x == target)
            count += 1;
        }
        
        if(count == 0)
          System.out.println(target + " is not present in the given array");
        else
           System.out.println(target + " is present " + count + " times in the given array");

        
        
        


    }
}