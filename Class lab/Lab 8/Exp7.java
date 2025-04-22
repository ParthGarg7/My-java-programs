import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exp7 {
    public static void main(String[] args) {
        try {
            // Open the file for reading
            FileReader fileReader = new FileReader("student.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            System.out.println("Contents of student.txt:");
            // Read and print lines
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: student.txt file not found.");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
            e.printStackTrace(); // Optional: for debugging
        }
    }
}
