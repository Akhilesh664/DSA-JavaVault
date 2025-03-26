package MultiThreading;

//[IMP] Work architecture in multithreading :
//=>if you use t.start() it leads to start thread and send signal to jvm to runs/execute run() method by default
//=>if you use t.run() it runs method instantly


class MyThread2 extends Thread{
    public void run(){
        for(int i =0; i<5; i++){
            System.out.println("children thread");
        }
    }
}

public class DiffThreadStartRun {

    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        MyThread2 t2 = new MyThread2();

        for(int i =0; i<5; i++){
            System.out.println("parent class");
        }

        t1.start();
        t2.start();
        t1.run();
        t2.run();

        for(int i =0; i<5; i++){
            System.out.println("parent class");
        }

    }

}
