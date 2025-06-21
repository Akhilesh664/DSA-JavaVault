package Part4;

public class Demo {

    int nonStaticVar = 10;

    static void staticMethod() {
//         System.out.println(nonStaticVar); // Error: non-static variable cannot be referenced from a static context
    }

    public static void main(String[] args) {
        Demo.staticMethod();
        //Static methods cannot access instance variables because they do not belong to any specific instance.
    }
}
