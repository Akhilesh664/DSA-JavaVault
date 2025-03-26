package MultiThreading;

class A extends Thread{
    public void run(){
        for(int i=1; i<4; i++){
            Thread.yield(); // [yield()]: hinting the scheduler to allow other threads which is equal or more important thread to execute (in this case, the main thread) to run.
            System.out.println("parent thread");
        }
    }
}

public class ThreadYield {
    public static void main(String[] args) {
        A p = new A();
        p.start();
        for(int i=1; i<5; i++){
            System.out.println("main thread");
        }
    }
}
