package OOPS.Abstraction;

interface Bank {

    // Interface methods are implicitly:
    // public + abstract
    void interestRate();
}

class HDFC implements Bank {

    // MUST be public because interface methods are public by default
    public void interestRate() {
        System.out.println("SBI Interest Rate is 8%");
    }

    // This method is COMPLETELY ALLOWED
    // Even though it is NOT declared in the Bank interface
    // BUT it will NOT be accessible using a Bank reference
    public void deposit() {
        System.out.println("hello deposit");
    }
}

class SBI implements Bank {

    // Providing implementation for interface method
    public void interestRate() {
        System.out.println("HDFC Interest Rate is 8%");
    }
}

public class BankAbstractionUsingInterface_3 {

    public static void main(String[] args) {

        // Interface reference pointing to implementation object
        // This is ABSTRACTION
        Bank b = new HDFC();

        // Allowed: interestRate() is declared in Bank interface
        b.interestRate();

        // ❌ NOT allowed:
        // b.deposit();
        // Compile-time error:
        // The method deposit() is undefined for the type Bank

        // Concrete class reference
        HDFC h = new HDFC();

        // Allowed: deposit() belongs to HDFC class
        h.deposit();
    }
}
