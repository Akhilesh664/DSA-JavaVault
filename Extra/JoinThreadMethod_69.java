package Extra;

public class JoinThreadMethod_69 extends Thread{

    public void run(){
        for(int i = 1; i < 5; i++){
            try{
                Thread.sleep(500);
            }catch(Exception ex){
                System.out.println(ex);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        JoinThreadMethod_69 t1 = new JoinThreadMethod_69();
        JoinThreadMethod_69 t2 = new JoinThreadMethod_69();
        JoinThreadMethod_69 t3 = new JoinThreadMethod_69();

        t1.start();
        try{
            t1.join();
        }catch(Exception ex){
            System.out.println(ex);
        }
        t2.start();
        t3.start();

    }
}
