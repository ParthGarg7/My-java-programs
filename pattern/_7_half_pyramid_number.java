import java.util.*;
  
   public class _7_half_pyramid_number{
      public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("how many lines do you want to print: ");
	 int lines = sc.nextInt();
	 for(int i = 0 ; i <= lines ; i++ ){
	     for(int j = lines - i ; j > 0 ; j--){
	         System.out.print(lines - j - i + 1);
	     }
	     System.out.println();
	 }

      }
   }
