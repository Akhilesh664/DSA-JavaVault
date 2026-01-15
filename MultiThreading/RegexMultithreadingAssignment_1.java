package MultiThreading;

/**
 Task 1: Create two Thread,
 one is finding avg of first 10 numbers and
 another thread is printing the square of the number stored in array arr={1, 20, 50, 15, 30} and
 make sure threads can execute one by one?
**/

class AvgThread extends Thread {

    @Override
    public void run() {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        double avg = sum / 10.0;
        System.out.println("Average of first 10 numbers = " + avg);
    }
}



class SquareThread extends Thread {

    int arr[] = {1, 20, 50, 15, 30};

    @Override
    public void run() {

        System.out.println("Squares of array elements:");

        for (int n : arr) {
            System.out.println(n + " : " + (n * n));
        }
    }
}


public class RegexMultithreadingAssignment_1 {

    public static void main(String[] args) {

        AvgThread t1 = new AvgThread();
        SquareThread t2 = new SquareThread();

        try {
            t1.start();   // Start thread 1
            t1.join();    // Wait until t1 finishes (one-by-one execution)

            t2.start();   // Now start thread 2
            t2.join();    // Wait until t2 finishes

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Both threads executed one by one.");
    }

}
