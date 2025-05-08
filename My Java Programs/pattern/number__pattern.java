import java.util.*;

   public class number__pattern{
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.print("How many line you want to print? ");
          int lines = sc.nextInt();
     
          for(int i = 1 ; i <= lines ; i++){
              for(int j = 1 ; j <= i ; j++){
                   System.out.printf(" %d ",i);
              }
              System.out.println();
            
          }
      }
   }