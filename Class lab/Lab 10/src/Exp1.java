import java.util.ArrayList;

public class Exp1 {

    public static void main(String[] args) {
        // Autoboxing: int values automatically converted to Integer
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(17);
        numbers.add(18);
        numbers.add(19);
        numbers.add(20);

        System.out.println("Prime number check:");

        // Unboxing: Integer to int
        for (Integer num : numbers) {
            int value = num; // unboxing
            if (isPrime(value)) {
                System.out.println(value + " is a prime number.");
            } else {
                System.out.println(value + " is not a prime number.");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
