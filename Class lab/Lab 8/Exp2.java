// Outer class Car (non-public)
class Car {

    // Inner class Engine (non-static)
    class Engine {
        public void start() {
            System.out.println("Engine started");
        }

        public void stop() {
            System.out.println("Engine stopped");
        }
    }

    // Method in Car class
    public void drive() {
        Engine engine = new Engine();  // Creating instance of inner class
        engine.start();
        System.out.println("Car is driving...");
        engine.stop();
    }
}

// Public class with main method
public class Exp2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
