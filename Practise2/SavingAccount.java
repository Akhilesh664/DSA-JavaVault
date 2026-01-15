// 1st cdac java 2 assignment
// Extends BankAccount. Represents a savings account with interest
package Practise2;

public class SavingAccount extends BankAccount {

    private int intrestRate;

    public int getIntrestRate() {
        return intrestRate;
    }

    public void setIntrestRate(int intrestRate) {
        this.intrestRate = intrestRate;
    }


    void addInterest() {
        int principal = getTotalBalance();  // Principal amount
        int time = 5;           // Time period in years

        int interest = (int)((principal * intrestRate * time) / 100.0);
        setTotalBalance(interest + principal);

    }

    public static void main(String[] args) {
        var sa = new SavingAccount();
        sa.setTotalBalance(3000);
        System.out.println(sa.getTotalBalance());
        sa.setIntrestRate(10);
        sa.addInterest();
        System.out.println(sa.getTotalBalance());


    }


}