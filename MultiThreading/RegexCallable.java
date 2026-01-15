package MultiThreading;

import java.util.concurrent.*;

// Callable returns a value (unlike Runnable)
// Here Demo2 implements Callable and returns a String.
class Demo2 implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("call() method executed from callable Demo2");
        return "success";   // This value will be returned to Future
    }
}


public class RegexCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Demo2 d2 = new Demo2(); // Task to be executed by threads

        // ExecutorService with a thread pool of size 10
        // → It can run up to 10 callable tasks in parallel
        ExecutorService exServices = Executors.newFixedThreadPool(10);

        // Submit the same callable object 15 times
        for (int i = 0; i < 15; i++) {

            // submit() returns a Future object
            // Future represents the result of the asynchronous computation
            Future<String> submit = exServices.submit(d2);

            // get() waits for the task to finish and returns the value from call()
            System.out.println(submit.get().toString());
        }

        // Always shut down executor to free resources
        exServices.shutdown();
    }
}
