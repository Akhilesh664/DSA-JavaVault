 package MultiThreading;

class SharedResource {
    private boolean ready = false;

    public synchronized void produce() {
        try {
            System.out.println("Producing...");
            Thread.sleep(1000);
            ready = true;
            notify(); // Notify waiting thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void consume() {
        while (!ready) {
            try {
                wait(); // Wait until ready
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consuming...");
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(resource::produce);
        Thread consumer = new Thread(resource::consume);

        consumer.start();
        producer.start();
    }
}
