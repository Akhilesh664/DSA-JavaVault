package MultiThreading;

class YieldDemo extends Thread {

    YieldDemo(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - " + i);

            if (i == 3) {
                System.out.println(getName() + " yielding...");
                Thread.yield(); // hint to scheduler
            }
        }
    }
}

public class ThreadYield_2 {
    public static void main(String[] args) {

        YieldDemo t1 = new YieldDemo("Thread-1");
        YieldDemo t2 = new YieldDemo("Thread-2");

        t1.start();
        t2.start();
    }
}
