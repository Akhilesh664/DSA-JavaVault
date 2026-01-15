// 1st cdac java 2 assignment
// Base class for SavingAccount and CheckingAccount

package Practise2;

public class BankAccount {

    private String accountNumber;
    private int totalBalance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(int totalBalance) {
        this.totalBalance = totalBalance;
    }

    void Deposit(int amt){
        if(amt > 0){
            totalBalance = totalBalance + amt;
        }else{
            System.out.println("invalid deposit");
        }
    }

    void Withdraw(int amt){
        if(totalBalance > 0 && totalBalance > amt){
            totalBalance = totalBalance - amt;
        }else{
            System.out.println("low balance");
        }
    }

    void getBalance(){
        System.out.println("your balance:" +totalBalance);
    }


    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setAccountNumber("ai0011");
        System.out.println(ba.getAccountNumber());

    }

}
