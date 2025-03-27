// Test class

public class Exp3 {

    public static void main(String[] args) {
        Worker dailyWorker = new DailyWorker("raju", 100);  // Paid per day
        Worker salariedWorker = new SalariedWorker("munna", 50); // Fixed rate

        // Test cases
        System.out.println(dailyWorker.name + " (Daily Worker) Weekly Pay: " + dailyWorker.computePay(48)); // 6 days
        System.out.println(salariedWorker.name + " (Salaried Worker) Weekly Pay: " + salariedWorker.computePay(50)); // Fixed 40-hour pay
    }
}

// Base class Worker
abstract class Worker {

    protected String name;
    protected double salaryRate;

    // Constructor
    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    // Abstract method to compute pay
    abstract double computePay(int hours);
}

// DailyWorker subclass
class DailyWorker extends Worker {

    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    // Computes pay based on number of days worked (assuming 8 hours per day)
    @Override
    double computePay(int hours) {
        int daysWorked = hours / 8; // Convert hours to full working days
        return daysWorked * salaryRate;
    }
}

// SalariedWorker subclass
class SalariedWorker extends Worker {

    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    // Computes pay as a fixed salary for 40 hours per week
    @Override
    double computePay(int hours) {
        return 40 * salaryRate; // Fixed pay for a 40-hour week
    }
}
