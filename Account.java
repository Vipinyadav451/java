class Account {

    int accNO;
    double balance;

    static String bankName = "State Bank of India";

    // Constructor
    Account(int accNO, double balance) {
        this.accNO = accNO;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited successfully.");
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Display method
    void display() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accNO);
        System.out.println("Balance: " + balance);
        System.out.println("--------------------");
    }

    // public class main {

    public static void main(String[] args) {

        Account a1 = new Account(101, 5000);
        Account a2 = new Account(102, 10000);

        a1.deposit(2000);
        a2.withdraw(3000);

        a1.display();
        a2.display();
        Account.bankName = "mre";

        System.out.println(bankName);

        // Both accounts share the same bankName
        // System.out.println("Bank Name using a1: " + a1.bankName);
        // System.out.println("Bank Name using a2: " + a2.bankName);
    }
}