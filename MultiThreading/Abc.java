package MultiThreading;

public class Abc extends Thread {

    @Override
    public void run() {

//        if(Thread.currentThread().isDaemon()) {   // isDaemon() returns true if the thread is a daemon thread, otherwise it returns false.
//            System.out.println("Daemon Thread");
//        } else{
//            System.out.println("Not a Daemon Thread");
//        }
//        System.out.println("run method executes");
//        System.out.println("Current Thread: " + Thread.currentThread()); // returns the current thread [Thread-1, 5, main] such that [Current ThreadName, Priority, ThreadGroup Name]

        for (int i = 1; i <= 5; i++) {
            System.out.println("i---------------->"+i);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e) {
                System.out.println("Exception: "+e);
            }

        }
    }

    public static void main(String[] args) {

        Abc a1 = new Abc();
//        Abc a2 = new Abc();
//        Abc a3 = new Abc();
//
//        a1.setName("MyThread1");
//        a2.setName("MyThread2");
//        a3.setName("MyThread3");
//
//        // Setting priorities
//        a1.setPriority(Thread.MIN_PRIORITY);   // 1
//        a2.setPriority(Thread.NORM_PRIORITY);  // 5
//        a3.setPriority(Thread.MAX_PRIORITY);   // 10
//
//        System.out.println("For a1");
//        System.out.println("Thread Name: " + a1.getName());
//        System.out.println("Thread Priority: " + a1.getPriority());
//        System.out.println("Thread ID: " + a1.getId());
//        System.out.println();
//
//        System.out.println("For a2");
//        System.out.println("Thread Name: " + a2.getName());
//        System.out.println("Thread Priority: " + a2.getPriority());
//        System.out.println("Thread ID: " + a2.getId());
//        System.out.println();
//
//        System.out.println("For a3");
//        System.out.println("Thread Name: " + a3.getName());
//        System.out.println("Thread Priority: " + a3.getPriority());
//        System.out.println("Thread ID: " + a3.getId());
//        System.out.println();

        // Start all threads
        a1.start();
//        a2.start();
//        a3.start();
    }
}
