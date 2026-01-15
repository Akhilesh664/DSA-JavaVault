package Practise3;

// Implements CreditCard interface. Used by CreditCardMain to demonstrate payment processing
public class BankAccount implements CreditCard{

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void makePayment(double amount, String currency){
        double convertAmount = convertCurrency(amount, currency);
        if(balance >= convertAmount) {
            balance -= convertAmount;
            System.out.println("Payment of " + amount + " " + currency + " successful.");
        } else {
            System.out.println("Insufficient balance for the payment.");
        }
    }

    double convertCurrency(double amount, String currency){
        return switch (currency) {
            case "Rupees" -> amount / 74.0;
            case "Dollars" -> amount;
            case "Pounds" -> amount * 1.38;
            default -> throw new IllegalArgumentException("Unsupported currency: " + currency);
        };
    }

    public double getBalance() {
        return balance;
    }
}
