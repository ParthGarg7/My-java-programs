import java.util.*;

   public class _1_break{
       public static void main(String[] args){
          int num;

	  Scanner sc = new Scanner(System.in);
          while(true){

		  System.out.printf("Enter a number: ");
                  num = sc.nextInt();
                  if(num % 10 == 0){
		      break;
		  }
	  }
	  System.out.printf(" %d is a multiple of 10\n",num);
       }
   
   }

