public class program3{
    public static void main(String[] args) {

        A obj1 = new A();
        A obj2 = new A(7,8);
        A obj3 = new A(9);

        System.out.println("Value of a is " + obj1.a + " Value of b is " + obj1.b );
        System.out.println("Value of a is " + obj2.a + " Value of b is " + obj2.b );
        System.out.println("Value of a is " + obj3.a + " Value of b is " + obj3.b );
        
    }
}

class A {
    int a = 5, b = 10;

    A() {
        System.out.println("IN class A");
    }

    A(int a, int b) {
        System.out.println("IN class A");
        this.a = a;
        this.b = b;
    }

    A(int a) {  
        this.a = a;  
        System.out.println("IN class A (single parameter)");
        display();
    }

    void display() {
        System.out.println("Value of a is " + a);
    }

}
