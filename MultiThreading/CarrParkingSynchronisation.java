package MultiThreading;

class Car implements Runnable{

    @Override
    public synchronized void run() { // synchronized method [for main thread execution]
//    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+":Come to parking");
            Thread.sleep(2000);
            synchronized (this){ // synchronized block [for subprocess execution]
                System.out.println(Thread.currentThread().getName() + ":Take the car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + ":Drive the car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + ":Drive Back to parking");
                Thread.sleep(2000);
            }
            }catch (InterruptedException e) {
            System.out.println("Exception: "+e);
        }

    }

}


public class CarrParkingSynchronisation {

    public static void main(String[] args) {

        Car c1 = new Car();
        Thread t1 = new Thread(c1);
        t1.setName("Son - 1");
        Thread t2 = new Thread(c1);
        t2.setName("Son - 2");
        Thread t3 = new Thread(c1);
        t3.setName("Son - 3");

        t1.start();
        t2.start();
        t3.start();

    }
}
