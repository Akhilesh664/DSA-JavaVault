package MultiThreading;


public class ThreadWritingTechniques implements Runnable {

    @Override
    public void run() {
        System.out.println("run() method executes - " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        // 1. Creating a Runnable object and passing to Thread
        ThreadWritingTechniques obj1 = new ThreadWritingTechniques();
        Thread t1 = new Thread(obj1);
        t1.start();

        // 2. Passing Runnable object directly to Thread constructor
        Thread t2 = new Thread(new ThreadWritingTechniques());
        t2.start();

        // 3. Anonymous Inner Class implementing Runnable
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run() method executes (anonymous class)");
            }
        };
        Thread t3 = new Thread(r1);
        t3.start();

        // 4. Direct anonymous Runnable inside Thread constructor
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run() method executed (inline anonymous runnable)");
            }
        });
        t4.start();

        // 5. Creating and starting thread in one line
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run() method executed (one-liner anonymous thread)");
            }
        }).start();

        // 6. Lambda expression (Runnable)
        Runnable r2 = () -> System.out.println("run() method executes (lambda runnable)");
        Thread t5 = new Thread(r2);
        t5.start();

        // 7. Lambda directly inside Thread
        Thread t6 = new Thread(() -> System.out.println("run() method executes (lambda inside thread)"));
        t6.start();

        // 8. One-line thread using lambda expression
        new Thread(() -> System.out.println("run() method executes (lambda one-liner)")).start();
    }
}
