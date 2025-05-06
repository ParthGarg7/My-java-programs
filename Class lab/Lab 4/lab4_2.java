
public class lab4_2 {

    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        MyAccount.deposit(1000);
        MyAccount.withdraw(500);
        System.out.println("Account Balance: ");
        MyAccount.CHECK_BALANCE();
        // MyAccount.checkBalance(); error because the method is private

    }
}

class BankAccount {

    private double balance;

    BankAccount() {
    }

    public void deposit(double amount) {
        balance += amount;
    }

    protected void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount; 
        }else {
            System.out.println("The amount entered is more then the current balance");
        }
    }

    private void checkBalance() {
        System.out.println("The current bank balance is: " + balance);
    }

    void CHECK_BALANCE() {
        checkBalance();
    }

}
