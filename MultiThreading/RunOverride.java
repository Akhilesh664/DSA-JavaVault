package MultiThreading;

// override of run method is possible in multithreading
class MyThread3 extends Thread{
    public void run(){
        System.out.println("Mythread3 class");
    }
}

class MyThread4 extends MyThread3{
//    public void run(){
//        System.out.println("Mythread4 class");
//    }
}

public class RunOverride {

    public static void main(String[] args) {
        MyThread4 t1 = new MyThread4();
        t1.start();
        t1.run();
    }
}
