import java.util.*;

   public class _3_half_pyramid{
        public static void main(String[] args){
	    System.out.print("How many lines of half pyramid pattern you want to print: ");
	    Scanner sc = new Scanner(System.in);
	    int lines = sc.nextInt();
	    for(int i = 1 ; i <= lines ; i++){
	        for(int j = 1 ; j <= i ; j++){
		    System.out.print(j);
		}
		System.out.println();
	    }
	}
   }
