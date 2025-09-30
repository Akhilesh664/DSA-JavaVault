// 1st cdac java 2 assignment

package Practise2;

public class CheckingAccount extends BankAccount{
    private int fee;

    public int getFee() {
        return fee;
    }
    public void setFee(int fee) {
        this.fee = fee;
    }
    void DeductFee(){
        setTotalBalance(getTotalBalance()-fee);
    }

    public static void main(String[] args) {
        var ca = new CheckingAccount();
        ca.setTotalBalance(3000);
        System.out.println(ca.getTotalBalance());
        ca.setFee(100);
        ca.DeductFee();
        System.out.println(ca.getTotalBalance());

    }
}
