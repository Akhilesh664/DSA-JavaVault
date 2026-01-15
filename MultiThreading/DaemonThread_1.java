package MultiThreading;

public class DaemonThread_1 {

    public static void main(String[] args) {

        Thread daemon = new Thread(() -> {
            System.out.println("Daemon thread started");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Daemon working: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Daemon interrupted");
                }
            }
            System.out.println("Daemon thread finished");
        });

        daemon.setDaemon(true); // make it a daemon thread
        daemon.start();

        System.out.println("Main (user) thread finished");
    }
}
