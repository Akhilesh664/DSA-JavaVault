package MultiThreading;

public class SynchroniziedExample {
    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread t1 = new Thread(()->{
            for (int i = 0; i<1000; i++){
                counter.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i<1000; i++){
                counter.increment();
            }
        });

        t1.start();
        t2.start();


        // After both threads finish, print the final count
        System.out.println("Count: " + counter.getCount());

    }

}
