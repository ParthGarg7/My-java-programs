import java.util.Scanner;

// Main class
public class Exp4_TrunkCallCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // User input for duration
        System.out.print("Enter call duration in minutes: ");
        int duration = scan.nextInt();

        // User input for call type
        System.out.println("Select call type: ");
        System.out.println("1. Ordinary");
        System.out.println("2. Urgent");
        System.out.println("3. Lightning");

        int choice = scan.nextInt();

        TrunkCall call = null;

        // Create appropriate object based on user choice
        switch (choice) {
            case 1:
                call = new OrdinaryCall(duration);
                break;
            case 2:
                call = new UrgentCall(duration);
                break;
            case 3:
                call = new LightningCall(duration);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        // Calculate and display charge
        System.out.println("Total charge for the call: " + call.computeCharge());

        scan.close();
    }
}

abstract class TrunkCall {

    protected int duration; // in minutes

    // Constructor
    public TrunkCall(int duration) {
        this.duration = duration;
    }

    // Abstract method to compute charge
    abstract double computeCharge();
}

// Ordinary call subclass
class OrdinaryCall extends TrunkCall {

    private static final double RATE = 2.0; // Cost per minute

    public OrdinaryCall(int duration) {
        super(duration);
    }

    @Override
    double computeCharge() {
        return duration * RATE;
    }
}

// Urgent call subclass
class UrgentCall extends TrunkCall {

    private static final double RATE = 3.5; // Cost per minute

    public UrgentCall(int duration) {
        super(duration);
    }

    @Override
    double computeCharge() {
        return duration * RATE;
    }
}

// Lightning call subclass
class LightningCall extends TrunkCall {

    private static final double RATE = 5.0; // Cost per minute

    public LightningCall(int duration) {
        super(duration);
    }

    @Override
    double computeCharge() {
        return duration * RATE;
    }
}
