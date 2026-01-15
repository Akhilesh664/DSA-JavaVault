package MultiThreading;

public class RegexDeadLock_2 implements Runnable {

    String res1 = "Java";
    String res2 = "Sql";
    String res3 = "Dsa";
    @Override
    public void run() {
         String name = Thread.currentThread().getName();

         if(name.equals("akhil")){
            try {
                Thread.sleep(5000);
                synchronized (res1) {
                    System.out.println("Student " + name + " is find Book and going to lock it " + res1);
                    Thread.sleep(5000);
                    synchronized (res2) {
                        System.out.println("Student " + name + " is find Book and going to lock it " + res2);
                        Thread.sleep(5000);
                        synchronized (res3) {
                            System.out.println("Student " + name + " is find Book and going to lock it " + res3);
                        }
                    }
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
         }else{
             try {
                 Thread.sleep(5000);
                 synchronized (res3) {
                     System.out.println("Student " + name + " is find Book and going to lock it " + res3);
                     Thread.sleep(5000);
                     synchronized (res2) {
                         System.out.println("Student " + name + " is find Book and going to lock it " + res2);
                         Thread.sleep(5000);
                         synchronized (res1) {
                             System.out.println("Student " + name + " is find Book and going to lock it " + res1);
                         }
                     }
                 }
             }catch (Exception e) {
                 e.printStackTrace();
             }
         }

    }

    public static void main(String[] args) {

        System.out.println("Main Thread starts here...");

        RegexDeadLock_2 rd = new RegexDeadLock_2();
        Thread t1 = new Thread(rd);
        t1.setName("akhil");
        t1.start();

        Thread t2 = new Thread(rd);
        t2.setName("ajay");
        t2.start();


    }
}
