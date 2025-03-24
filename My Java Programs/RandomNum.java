import java.util.Random;

public class RandomNum{
    public static void main(String[] args) {
        Random Random = new Random();

        int num1 = Random.nextInt();
        int num2 = Random.nextInt(100);
        Double num3 = Random.nextDouble();

        System.out.println("num1: " + num1 + " num2: " + num2 + " num3: " + num3*100);
    }
}