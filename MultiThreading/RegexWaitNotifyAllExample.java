package MultiThreading;

class Customer2{

    int bal;

    Customer2(int bal){
        this.bal = bal;
    }

    synchronized void withdraw(int want){
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw: "+want);

        while(want > bal){
            System.out.println("Low Balance! Waiting for Deposit...");
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Withdrawal successful!");
        System.out.println("Previous Balance: "+bal);
        bal -= want;
        System.out.println("Updated Balance: "+bal);

    }

    synchronized void deposit(int amt){
        System.out.println(Thread.currentThread().getName()+" Depositing Amount: "+amt);

        bal += amt;
        System.out.println("Amount Deposited. Updated Balance: "+bal);

        notifyAll(); // wake all other Thread for withdraw
    }



}

public class RegexWaitNotifyAllExample {

    public static void main(String[] args) {

        Customer2 customer = new Customer2(10000);

        // first withdraw Thread
        new Thread(){
            public void run(){
                customer.withdraw(12000);
            }
        }.start();

        // second withdraw Thread
        new Thread(){
            public void run(){
                customer.withdraw(12000);
            }
        }.start();

        // third deposit Thread
        new Thread(){
            public void run(){
                customer.deposit(10000);
            }
        }.start();

    }
}
