package OOPS.Inheritance;

// [NOTE]: Parent reference → child object
// Child behavior replaces parent behavior

class Bank {
    double getRateOfInterest() {
        return 5.0;
    }
}

class SBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 6.5;
    }
}

public class BankInheritance_3 {
    public static void main(String[] args) {
        Bank b = new SBI();
        System.out.println(b.getRateOfInterest());
    }
}
