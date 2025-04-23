import java.util.HashSet;

public class Exp4 {
    public static void main(String[] args) {
        // Array with duplicate names
        String[] names = { "Aman", "Varchasv", "Divyansh", "Varchasv", "Aman" };

        // Store in HashSet to remove duplicates
        HashSet<String> uniqueNames = new HashSet<>();

        for (String name : names) {
            uniqueNames.add(name); // HashSet ignores duplicates
        }

        // Check if a specific name exists
        String checkName = "Divyansh";
        if (uniqueNames.contains(checkName)) {
            System.out.println(checkName + " exists in the set.");
        } else {
            System.out.println(checkName + " does not exist in the set.");
        }

        // Print unique names
        System.out.println("\nUnique names:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
