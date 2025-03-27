import java.util.Scanner;

public class Exp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle Example
        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();
        Circle c1 = new Circle(r);
        System.out.println("Area of the circle of radius " + c1.radius+ " is " + c1.calculateArea());

        // Rectangle Example
        System.out.print("\nEnter length of the rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double w = sc.nextDouble();
        Rectangle r1 = new Rectangle(l, w);
        System.out.println("Area of the rectangle of length " 
        + r1.length + " and width " + r1.width + " is " + r1.calculateArea());

        sc.close();
    }
}


abstract class Shape {
    abstract public double calculateArea();
}

class Circle extends Shape {
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

