import java.util.*;

public class Sum{
    public static void main(String[] args){
        ArrayList<Integer> A1 = new ArrayList<>(List.of(3,5,3,8,2,5));
        HashSet<Integer> H1 = new HashSet<>(A1);
        int sum = 0;
        for(int x: H1){
            sum += x; 
        }

        System.out.println("sum is " + sum);
    }
}