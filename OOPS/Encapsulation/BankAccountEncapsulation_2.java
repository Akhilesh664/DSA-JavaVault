package OOPS.Encapsulation;

// [NOTE]: User cannot directly change balance
// All rules are inside the class

class BankAccount{
    private double balance;

    public void deposit(double amount){
        if(amount > 0 ){
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance) {
            balance -= amount;
        }else{
            System.out.println("Invalid Withdrawal");
        }
    }

    public double getBalance(){
        return balance;
    }
}

public class BankAccountEncapsulation_2 {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
        b1.deposit(1000);
        System.out.println(b1.getBalance());
        b1.withdraw(530);
        System.out.println(b1.getBalance());
        b1.withdraw(1000);
        System.out.println(b1.getBalance());


    }

}
