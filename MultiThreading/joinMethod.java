package MultiThreading;

class Task2 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" started");
        try{
            for(int i=1; i<=5; i++){
                System.out.println(Thread.currentThread().getName()+" - "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(Thread.currentThread().getName()+" interrupted");;
        }
        System.out.println(Thread.currentThread().getName()+" finished");
    }
}

public class joinMethod {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Task2(), "Task-1");
        Thread t2 = new Thread(new Task2(), "Task-2");
        t1.start();
        t1.join();

        t2.start();
        t2.join();
    }
}
