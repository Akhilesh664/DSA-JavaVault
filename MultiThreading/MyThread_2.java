package MultiThreading;

public class MyThread_2 extends Thread {
    public void run(){
        for (int i = 1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+" - "+i);
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread_2 t1 = new MyThread_2();
        MyThread_2 t2 = new MyThread_2();

        t1.start();
        t2.start();
    }
}
