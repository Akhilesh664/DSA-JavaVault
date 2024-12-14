package Part4;

public class Example1 {
    int nonStaticVar = 10;

    static void staticMethod() {
        // Creating an instance of the Example1 class
        Example1 example = new Example1();
        System.out.println(example.nonStaticVar); // Correct way to access the non-static variable
    }

    public static void main(String[] args) {
        staticMethod();
    }
}