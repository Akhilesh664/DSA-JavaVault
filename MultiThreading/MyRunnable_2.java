package MultiThreading;

public class MyRunnable_2 implements Runnable{

    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+" - "+i);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable_2());
        Thread t2 = new Thread(new MyRunnable_2());

        t1.start();
        t2.start();

    }
}
