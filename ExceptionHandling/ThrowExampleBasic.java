package ExceptionHandling;

public class ThrowExampleBasic {

    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above."); // Explicitly throwing an exception
        }
        System.out.println("Eligible to vote!");
    }

    public static void main(String[] args) {
        checkAge(16); // This will cause an exception
    }

}
