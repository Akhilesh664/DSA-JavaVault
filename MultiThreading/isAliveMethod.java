package MultiThreading;

class Mythread3 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(" Focus is Important! ");
        }
    }
}


public class isAliveMethod {

    public static void main(String[] args) {

        Mythread3 t1 = new Mythread3();
        Thread t2 = new Thread(t1);
        System.out.println(" t2.isAlive() : "+t2.isAlive()); // means thread is not started
        t2.start();
        System.out.println(" t2.isAlive() : "+t2.isAlive());


    }
}
