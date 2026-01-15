package OOPS.Polymorphism;

// [NOTE]: Decision made at compile time
// Return type alone cannot change overloading

class Calculator {

    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }

    int add(int a ,int b ,int c){
        return a+b+c;
    }

}

public class CalculatorCompileTimePolymorphism_2 {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        System.out.println(c.add(10,20));
        System.out.println(c.add(10.5,20.6));
        System.out.println(c.add(1,2, 6));

    }
}
