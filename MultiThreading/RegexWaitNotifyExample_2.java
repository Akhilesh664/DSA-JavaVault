package MultiThreading;

class SharedBuffer{
    private int data;
    private boolean hasData = false;

    synchronized void produce(int value) throws InterruptedException{
        while(hasData){
            wait();
        }
        data = value;
        System.out.println("Produced: "+data);
        hasData = true;
        notify();
    }

    synchronized void consume() throws InterruptedException{
        while(!hasData){
            wait();
        }
        System.out.println("Consumed: "+data);
        hasData = false;
        notify();
    }
}

public class RegexWaitNotifyExample_2 {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();
        new Thread(()->{
            try{
                buffer.produce(10);
            } catch (Exception e){
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try{
                buffer.consume();
            } catch (Exception e){
                e.printStackTrace();
            }
        }).start();
    }


}
















