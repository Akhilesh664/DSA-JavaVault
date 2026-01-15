package MultiThreading;

class Customer {

    int bal;

    Customer(int bal) {
        this.bal = bal;
    }

    synchronized void withdraw(int want) {
        System.out.println("Attempting to withdraw: " + want);

        if (want > bal) {
            System.out.println("Low Balance! Waiting for Deposit...");

            try {
                wait();   // waiting for deposit
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Withdrawal successful!");
        System.out.println("Previous Balance: " + bal);
        bal -= want;
        System.out.println("Updated Balance: " + bal);
    }

    synchronized void deposit(int amt) {
        System.out.println("Depositing Amount: " + amt);

        bal += amt;
        System.out.println("Amount Deposited. Updated Balance: " + bal);

        notify();  // notifying waiting thread
    }
}

public class RegexWaitNotifyExample {

    public static void main(String[] args) {

        Customer customer = new Customer(10000);

        // Thread for Withdrawal
        new Thread() {
            public void run() {
                customer.withdraw(12000);
            }
        }.start();

        // Thread for Deposit
        new Thread() {
            public void run() {
                customer.deposit(5000);
            }
        }.start();
    }
}
