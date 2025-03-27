
import java.util.Scanner;

public class Exp3_BankDemo {

    public static void main(String[] args) {
        Account A1 = new Account();
        Scanner scan = new Scanner(System.in);
        System.out.println("Your Current balance is " + A1.balance);
        int x = 0;
        while (x != 4) {
            System.out.println("Press 1 for deposit");
            System.out.println("Press 2 for withdrawal");
            System.out.println("Press 3 for checking current balance");
            System.out.println("Press 4 for exit");
            x = scan.nextInt();
            double Amount;
            switch (x) {
                case 1: {
                    System.out.println("Enter the amount to deposit: ");
                    Amount = scan.nextDouble();
                    A1.deposit(Amount);
                }
                break;

                case 2: {
                    System.out.println("Enter the amount to withdraw: ");
                    Amount = scan.nextDouble();
                    A1.withdraw(Amount);
                }
                break;

                case 3: {
                    A1.check_Balance();
                }
                break;

                case 4: {
                    break;
                }

                default:
                    throw new AssertionError();
            }
        }

        scan.close();

    }
}

interface Bank {

    void deposit(double amount);

    void withdraw(double amount);

}

class Account implements Bank {

    double balance = 0.0;

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
    }

    @Override
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void check_Balance() {
        System.out.println("Your current balance is " + balance);
    }

}
