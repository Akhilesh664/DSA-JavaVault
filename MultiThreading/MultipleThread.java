package MultiThreading;

public class MultipleThread extends Thread{

    private String message;

    public MultipleThread (String message){
        this.message = message;
    }
    public void run(){
        System.out.println(message);
    }

    public static void main(String[] args) {

        MultipleThread t1 = new MultipleThread("hello from thread 1");
        MultipleThread t2 = new MultipleThread("hello from thread 2");

        t1.start();
        t2.start();
    }
}
