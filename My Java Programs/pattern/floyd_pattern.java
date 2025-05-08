import java.util.*;

  public class floyd_pattern{
       public static void main(String[] args){
          Scanner Sc = new Scanner(System.in);
	  int a = 1;
          System.out.print("How many lines you want to print:");
          int lines = Sc.nextInt();
          for(int i = 1 ; i <= lines ; i++){
               for(int j = 1; j <= i ; j++){
                   System.out.printf("%d ",a);
                   a += 1; 
               }
	       
               System.out.println();
          }
       }
  }
