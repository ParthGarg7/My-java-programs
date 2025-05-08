
import java.util.*;

public class _2_prime {

    public static void main(String[] args) {
        int num, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                break;
            }
        }

        if (i == num) {
            System.out.printf("%d is a prime number\n", num);
        } else {
            System.out.printf("%d is not prime number\n", num);
        }

    }
}
