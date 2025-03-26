package MultiThreading;

//Instead of extending the Thread class, you can implement the Runnable interface, which allows for better flexibility
//- when you need to extend other classes as well.

public class MyRunnable implements Runnable{

    public void run(){
        System.out.println("hello from runnable thread.");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.start();
    }

}
