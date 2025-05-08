public class WithGenerics {

    public static void main(String[] args) {
        Add<Integer> a1 = new Add<>(3, 4);
        System.out.println("Sum of Integers: " + a1.ReturnSum());

        Add<Double> a2 = new Add<>(3.78, 4.90);
        System.out.println("Sum of Doubles: " + a2.ReturnSum());
    }
}

class Add<T extends Number> {

    public T a;
    public T b;

    public Add(T a, T b) {
        this.a = a;
        this.b = b;

    }

    public double ReturnSum() {
        return a.doubleValue() + b.doubleValue();
    }

}
