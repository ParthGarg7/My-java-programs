import java.util.*;

   public class _5_hollow_square{
       public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
	   System.out.print("How many lines you want to print of hollow square pattern: ");
           int lines = sc.nextInt();
           for(int i = 0; i <= lines ; i++){
	       for(int j = 0 ; j <= lines ; j++){
	           if(i == 0 || i == lines || j == 0 || j == lines){
		      System.out.print("*");
		   } else {
		      System.out.print(" ");
		   }
	       }
	       System.out.println();
	   }
       }
   }


