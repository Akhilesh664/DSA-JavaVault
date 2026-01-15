package Recursion;

public class FibonacciSeries {

    // 1st way with loop
    static int fibonacci1(int n) {
        if (n == 0) return 0;
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++){
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    // 2nd way with recursion
    static int fibonacci2(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci2(n - 1) + fibonacci2(n - 2);
    }

    static void printFibonacci(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci1(i) + " ");
//            System.out.print(fibonacci2(i) + " ");

        }
    }

    public static void main(String[] args) {

        int n = 10;
        printFibonacci(n);


    }
}
