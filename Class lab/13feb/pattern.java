
import java.util.Scanner;


 public class pattern{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scan.nextInt();

        for(int i = 1 ; i <= rows; i++){
            for(int j = 1; j <= 2*rows - 1; j++){

                if (j  >= rows-i + 1 && j <= rows+i - 1 )
                {
                   if (i % 2 == 1) 
                    System.out.print("*");  
                   else 
                    System.out.print("#");  
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
    }
 }