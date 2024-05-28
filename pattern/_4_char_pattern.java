import java.util.*;

   public class _4_char_pattern{
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
	  System.out.print("enter number of lines you want to print of char pattern: ");
	  int lines = sc.nextInt();
	  char ch = 'A';
	  for(int i = 0 ; i <= lines; i++){
	     for(int j = 0; j <= i ; j++){
	         System.out.print(ch);
		 ch += 1;
	     }
	     
	     System.out.println();
	  }
      }
   }
