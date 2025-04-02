package Java_8;

//💡 A functional interface: (🔹 @FunctionalInterface) is an interface that contains only one abstract method but can have multiple default and static methods.
//💡 Uses: Java 8 provides built-in functional interfaces like Predicate, Function, and Consumer. In an e-commerce platform,-
// -you can use a Predicate to check discount eligibility for a customer

@FunctionalInterface
interface Greeting{
    void sayHello(String name);
}

public class FunctionalInterfaceExample_2 {
    public static void main(String[] args) {
        Greeting greet = (name) -> {
            System.out.println("Hello, "+name);
        };
        greet.sayHello("Akhilesh");
    }
}
