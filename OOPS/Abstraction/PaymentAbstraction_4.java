package OOPS.Abstraction;

//[Note]: User only knows pay(), not how payment works
// Implementation hidden from client

abstract class Payment{
    abstract void pay();
}

class CreditCard extends Payment{
    void pay(){
        System.out.println("Credit Card Payment");
    }
}

class DebitCard extends Payment{
    void pay(){
        System.out.println("Debit Card Payment");
    }
}

public class PaymentAbstraction_4 {
    public static void main(String[] args) {
        Payment p = new DebitCard();
        p.pay();

        DebitCard pa = new DebitCard();
        pa.pay();
    }
}
