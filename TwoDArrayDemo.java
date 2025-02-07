import java.util.Scanner;

public class TwoDArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Declaring and Initializing a 2D Array
        int[][] arr1 = new int[3][4]; // 3 rows, 4 columns
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[1][2] = 5;

        // 2. Direct Initialization
        int[][] arr2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 3. Creating a Jagged Array (Irregular Column Size)
        int[][] jaggedArr = new int[3][];
        jaggedArr[0] = new int[2]; // First row has 2 columns
        jaggedArr[1] = new int[3]; // Second row has 3 columns
        jaggedArr[2] = new int[1]; // Third row has 1 column

        // 4. Taking User Input for a 2D Array
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] userArray = new int[rows][cols];

        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                userArray[i][j] = sc.nextInt();
            }
        }

        // Printing all the arrays
        System.out.println("\nArray 1 (Declared & Partially Initialized):");
        printArray(arr1);

        System.out.println("\nArray 2 (Direct Initialization):");
        printArray(arr2);

        System.out.println("\nJagged Array:");
        printJaggedArray(jaggedArr);

        System.out.println("\nUser Input Array:");
        printArray(userArray);

        sc.close();
    }

    // Method to print a normal 2D array
    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Method to print a jagged 2D array
    public static void printJaggedArray(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
