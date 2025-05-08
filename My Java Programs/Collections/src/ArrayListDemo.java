import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> L1 = new ArrayList<>();
        L1.add(1);
        L1.add(2);

        ArrayList<Integer> L2 = new ArrayList<>();
        L2.add(3);
        L2.add(4);

        L1.addAll(1,L2);
        System.out.println(L1); 

    }
}

