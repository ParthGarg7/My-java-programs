
import java.util.*;

public class scanner{
    public static void main(String[] args) {
        Scanner ScanInput = new Scanner(System.in);

        System.out.println("Enter you name: ");
        String Name = ScanInput.nextLine();

        System.out.println("Enter you age: ");
        int age = ScanInput.nextInt();

        System.out.println("Your name is " + Name + " and your age is " + age); 

    }
}