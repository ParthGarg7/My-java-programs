import java.util.HashMap;
import java.util.Map;

public class Exp3 {
    public static void main(String[] args) {
        // Create HashMap to store inventory
        HashMap<Integer, Integer> inventory = new HashMap<>();

        // Add three products (productId → quantity)
        inventory.put(101, 50);
        inventory.put(102, 30);
        inventory.put(103, 20);

        // Update quantity of product with ID 102
        inventory.put(102, 45); // Overwrites the previous quantity
        System.out.println("Updated quantity for product 102 to 45.");

        // Remove product with ID 101
        inventory.remove(101);
        System.out.println("Removed product with ID 101.");

        // Display final inventory
        System.out.println("\nFinal Inventory:");
        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
