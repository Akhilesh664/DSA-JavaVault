package MultiThreading;

public class RegexDeadLock {
    public static void main(String[] args) {

        final String s1 = "hi";
        final String s2 = "hello";

        Thread t1 = new Thread() {
            public void run() {
            synchronized (s1) {
                System.out.println("Thread-1 locked resource-1 (s1)");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }

                System.out.println("Thread-1 waiting for resource-2 (s2)");

                synchronized (s2) {
                    System.out.println("Thread-1 locked resource-2");
                }
            }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
            synchronized (s2) {
                System.out.println("Thread-2 locked resource-2 (s2)");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }

                System.out.println("Thread-2 waiting for resource-1 (s1)");

                synchronized (s1) {
                    System.out.println("Thread-2 locked resource-1");
                }
            }
            }
        };

        t1.start();
        t2.start();
    }
}
