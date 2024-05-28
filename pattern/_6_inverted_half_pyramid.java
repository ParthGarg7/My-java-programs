import java.util.*;

   public class _6_inverted_half_pyramid{
       public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
	  System.out.print("How many lines you want to print of inverted half pyramid patter: ");
	  int lines = sc.nextInt();
	  for (int i = 0 ; i <= lines ; i++ ){
	      for(int j = 0 ; j <= lines ; j++){
	         if(j >= lines + 1 - i && j <= lines){
		     System.out.print("*");
		 } else {
		     System.out.print(" ");
		 }

	      }
	      System.out.println();
	  }
       }
   }
