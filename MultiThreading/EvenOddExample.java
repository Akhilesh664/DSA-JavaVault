package MultiThreading;

class PrintNumbers{
    private int num = 1;
    private final int limit = 10;

    public synchronized void printOdd() throws InterruptedException {
        while(num < limit){
            if(num % 2 == 0){
                Thread.sleep(500);
            }
            System.out.println(Thread.currentThread().getName()+" - "+num++);
            notify();
//            notifyAll();
        }
    }

    public synchronized void printEven() throws InterruptedException {
        while(num <= limit){
            if(num % 2 != 0){
                Thread.sleep(500);
            }
            System.out.println(Thread.currentThread().getName()+" - "+num++);
            notify();
//            notifyAll();
        }
    }
}

public class EvenOddExample {
    public static void main(String[] args) {
        PrintNumbers pn = new PrintNumbers();

        Thread t1 = new Thread(() -> {
            try{
                pn.printOdd();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        },"Odd");

        Thread t2 = new Thread(() -> {
            try{
                pn.printEven();
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        },"Even");

        t1.start();
        t2.start();

    }
}
