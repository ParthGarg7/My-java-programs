import java.util.*;

    public class _3_factorail{
       public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
	   System.out.print("Enter a number to find its factorial: ");
	   int num = sc.nextInt();
	   int fact = 1;
	   if( num == 0){
	       System.out.println("factorail of 0 is 1");
	   } else if ( num < 0 ) {
	       System.out.println("factorail of negative number does not exist");
	   }
	   else{
	      for (int i = 1;i <= num; i++){
	          fact *= i;
	      }
	   }
	   System.out.printf("Factorail of %d is %d\n",num,fact);

       }
    }
