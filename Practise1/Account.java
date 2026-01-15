package Practise1;

/**
 * Account.java
 * 
 * This class represents a basic Bank Account with common banking operations.
 * It demonstrates class structure, methods, and basic financial calculations.
 * 
 * This is a standalone class in the Practise1 package and doesn't have any direct
 * relationships with other classes in the package.
 * 
 * Features:
 * - Manages account number, account holder name, and balance
 * - Supports deposit, withdrawal, and interest calculation
 * - Includes input validation for transactions
 * - Provides a toString() method for easy account information display
 */
public class Account {
    int accNo;
    String accName;
    long amount;

    public Account(int accNo, String accName, long amount) {
        this.accNo = accNo;
        this.accName = accName;
        this.amount = amount;
    }

    void Withdraw(int amt){
        if(amount > 0 && amount > amt){
            amount = amount - amt;
        }else{
            System.out.println("low balance");
        }
    }

    void Deposit(int amt){
        if(amt > 0){
            amount = amount + amt;
        }else{
            System.out.println("invalid deposit");
        }
    }

    void Interest(int rate) {
        // Assuming some sample values for principal and time
        long principal = amount;  // Principal amount
        int time = 5;           // Time period in years

        // Simple interest formula: (Principal * Rate * Time) / 100
        double interest = (principal * rate * time) / 100.0;

        // Display the result
        System.out.println("The simple interest is: " + interest);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNo=" + accNo +
                ", accName='" + accName + '\'' +
                ", amount=" + amount +
                '}';
    }

    public static void main(String[] args) {
        var acc1 = new Account(101, "FD", 30000);

        System.out.println(acc1);
        acc1.Deposit(1000);
        System.out.println("=================");

        System.out.println(acc1);
        acc1.Withdraw(6000);
        System.out.println("=================");

        System.out.println(acc1);
        acc1.Interest(6);
        System.out.println(acc1);

    }
}
