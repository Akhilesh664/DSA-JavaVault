package Practise3;

public class CreditCardMain {

    public static void main(String[] args) {
        var account = new BankAccount(1000);

        account.makePayment(5000, "Rupees");
        account.makePayment(50, "Dollars");
        account.makePayment(100, "Pounds");

        System.out.println("remaining balance : "+account.getBalance());
    }
}
