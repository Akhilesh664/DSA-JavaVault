package MultiThreading;

class MyTask1 implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("Thread is started");
            for(int i=1; i<=5; i++){
                Thread.sleep(5000); // as thread is in sleep state, it will be interrupted by the main thread
                System.out.println("hello Thread");
            }
            System.out.println("Thread is finished");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

}

public class InterruptMethod{

    public static void main(String[] args){

        MyTask1 mt = new MyTask1();
        Thread t1 = new Thread(mt);

        t1.start();
        // Interrupt works when the thread is in sleep/wait/join state
        t1.interrupt(); // it basically interrupts the thread when it is in the sleep/blocked state

    }
}
