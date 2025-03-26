package MultiThreading;

public class MyThread extends Thread { // extending thread for using there functionality

    public void run(){  // run is method in class
        System.out.println("hello from run method");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();  // in with start thread made and run() method calls byDefault
//        t1.run();  // on the other hand run is simple methos in thread
    }
}
