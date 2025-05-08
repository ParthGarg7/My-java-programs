import java.util.*;

   public class _2_inverted_star{
       public static void main(String[] args){
	     Scanner sc = new Scanner(System.in);
	     System.out.print("How many lines of inverted star pattern you want to print: ");
	     int lines = sc.nextInt();
	     for(int i = 0; i < lines ; i++ ){
	          for(int j = 0 ; j < lines - i ; j++ ){
		        System.out.print("*");  
		  }
		  System.out.println();
	     }
		     
       }
   }
