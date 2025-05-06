
public class lab4_3 {

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        System.out.println(cal.add(5, 7));
        System.out.println(cal.add(15.89, 7.33));
        System.out.println(cal.add(5, 7.33));
        System.out.println(cal.add(5, 7, 8));
        System.out.println(cal.add("Parth ", "Garg"));

    }
}

class Calculator {

    int add(int num1, int num2) {
        return num1 + num2;
    }

    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    double add(double num1, double num2) {
        return num1 + num2;
    }

    String add(String s1, String s2) {
        return s1 + s2;
    }
}
