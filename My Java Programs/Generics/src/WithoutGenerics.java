
public class WithoutGenerics {

    public static void main(String[] args) {
        Add a1 = new Add(3, 4);

        System.out.print(a1.ReturnSum());
    }
}

class Add {

    public int a;
    public int b;

    public Add(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public int ReturnSum() {
        return a + b;
    }

}
