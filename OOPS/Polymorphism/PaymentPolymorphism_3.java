package OOPS.Polymorphism;

// [NOTE]: Interface reference = multiple implementations
// Core concept in Spring / Microservices

interface Payment {
    void pay();
}

class CreditCard implements Payment {
    public void pay() {
        System.out.println("Paid using Credit Card");
    }
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Paid using UPI");
    }
}


public class PaymentPolymorphism_3 {
    public static void main(String[] args) {
        Payment p;
        p = new CreditCard();
        p.pay();

        p = new UPI();
        p.pay();

    }
}
