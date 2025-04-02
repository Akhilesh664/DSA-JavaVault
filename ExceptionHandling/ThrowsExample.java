package ExceptionHandling;

public class ThrowsExample {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sleeping for 2 seconds...");
        Thread.sleep(2000); // throws InterruptedException
        System.out.println("Awake now!");
    }

}
