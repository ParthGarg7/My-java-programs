import java.util.*;

   public class _1_star{
      public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);

	  System.out.println("How many line of star pattern you want to print? ");
	  int lines = scanner.nextInt();

	  for(int i = 1 ; i <= lines ; i++){
	       for(int j = 1  ; j <= i ; j++){
	              System.out.print("*");
	       }
	       System.out.println();
	  }
      }
   }
