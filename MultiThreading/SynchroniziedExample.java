package MultiThreading;

class Counter {
    private int count = 0;

    // Synchronizing the increment method
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SynchroniziedExample {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        // Ensure main waits for both threads to finish
        t1.join();
        t2.join();

        // After both threads finish, print the final count
        System.out.println("Count: " + counter.getCount()); // Expected output: 2000
    }
}
