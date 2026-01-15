package MultiThreading;

class Demo1 implements Runnable {

    @Override
    public void run() {

        System.out.println("run() method Executed... " + Thread.currentThread().getName()+" : "+Thread.currentThread().getPriority());

        try {
            Thread.sleep(3000); // Blocked State
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("run() method Ended... " + Thread.currentThread().getName());
    }
}

public class RegexRunnable {
    public static void main(String[] args) {

        Demo1 d1 = new Demo1();

        Thread t1 = new Thread(d1);
        t1.setPriority(Thread.MAX_PRIORITY); // 10
        t1.setName("Thread-1");

        Thread t2 = new Thread(d1);
        t2.setName("Thread-2");
        t2.setPriority(Thread.MIN_PRIORITY); // 1

        Thread t3 = new Thread(d1);
        t3.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setName("Thread-3");

        t1.start();
        t3.start();  // Runnable
        t2.start();
    }

}
