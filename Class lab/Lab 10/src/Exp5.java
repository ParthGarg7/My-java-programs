import java.util.ArrayList;
import java.util.HashSet;

public class Exp5 {
    public static void main(String[] args) {
        // Original list with duplicates
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(5);

        // Convert to HashSet to get unique values
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);

        // Calculate sum of unique values
        int sum = 0;
        for (int num : uniqueNumbers) {
            sum += num;
        }

        // Print result
        System.out.println("Unique values: " + uniqueNumbers);
        System.out.println("Sum of unique values: " + sum);
    }
}
