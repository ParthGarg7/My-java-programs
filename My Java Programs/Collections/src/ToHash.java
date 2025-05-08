
import java.util.*;

public class ToHash {

    public static void main(String[] args) {
        String[] names = {"Aman", "Varchasv", "Divyansh", "Varchasv", "Aman"};
        HashSet<String> h1 = new HashSet<>(Arrays.asList(names));
        ArrayList A1 = new ArrayList<>(h1);
        Collections.sort(A1);
        System.out.println(h1);
        System.out.println(A1);

    }
}
