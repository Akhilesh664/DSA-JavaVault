package MultiThreading;

class LoggerDaemon implements Runnable {

    @Override
    public void run() {
        int count = 1;
        while (true) { // keep logging in background
            System.out.println("Logger running... Log entry #" + count++);
            try {
                Thread.sleep(1000); // simulate time-consuming logging
            } catch (InterruptedException e) {
                System.out.println("Logger interrupted");
            }
        }
    }
}

public class DaemonThread_2 {

    public static void main(String[] args) throws InterruptedException {

        Thread loggerThread = new Thread(new LoggerDaemon(), "LoggerThread");
        loggerThread.setDaemon(true); // make it daemon
        loggerThread.start();

        // Main application doing some work
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main application working... Task #" + i);
            Thread.sleep(1500);
        }

        System.out.println("Main application finished. JVM will stop daemon thread.");
    }

}
