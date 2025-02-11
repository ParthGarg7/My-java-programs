import java.util.Scanner;

  public class lab3_3_1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many terms of fibonacci series you want to print? ");
        int n = scan.nextInt();
        int a = 0, b = 1, c = 0;
        System.out.println("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;
            }
   }

  }