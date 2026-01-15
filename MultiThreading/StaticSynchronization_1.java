package MultiThreading;

class Counter1 {

    static int count = 0;

    // static synchronized method
    static synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() +
                " count = " + count);
    }
}

public class StaticSynchronization_1 {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> Counter1.increment(), "Thread-1");
        Thread t2 = new Thread(() -> Counter1.increment(), "Thread-2");

        t1.start();
        t2.start();
    }

}
