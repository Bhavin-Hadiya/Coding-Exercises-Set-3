public class BankAccount {

    // Instance variables (different for each account)
    String accountHolderName;
    double balance;

    // Static variable (shared by ALL accounts)
    static double interestRate = 0.05; // 5% default

    // Constructor
    BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance           = balance;
    }

    // Method to calculate interest earned
    double calculateInterest() {
        return balance * interestRate;
    }

    // Method to display account details and interest
    void displayAccountInfo() {
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : " + balance);
        System.out.println("Interest Rate  : " + (interestRate * 100) + "%");
        System.out.println("Interest Earned: " + calculateInterest());
    }

    // Static method to update interest rate for ALL accounts
    static void updateInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("Interest rate updated to : " + (interestRate * 100) + "%");
    }

    // Main method
    public static void main(String[] args) {

        // Create two bank accounts
        BankAccount acc1 = new BankAccount("Alice", 10000.0);
        BankAccount acc2 = new BankAccount("Bob",   25000.0);

        // Display details with default interest rate (5%)
        System.out.println("==============================");
        System.out.println("   BEFORE Rate Update (5%)   ");
        System.out.println("==============================");

        System.out.println("\n--- Account 1 ---");
        acc1.displayAccountInfo();

        System.out.println("\n--- Account 2 ---");
        acc2.displayAccountInfo();

        // Update interest rate using static method (affects ALL accounts)
        System.out.println("\n==============================");
        BankAccount.updateInterestRate(0.08); // change to 8%
        System.out.println("==============================");

        // Display details again with new interest rate (8%)
        System.out.println("\n   AFTER Rate Update (8%)    ");
        System.out.println("==============================");

        System.out.println("\n--- Account 1 ---");
        acc1.displayAccountInfo();

        System.out.println("\n--- Account 2 ---");
        acc2.displayAccountInfo();
    }
}