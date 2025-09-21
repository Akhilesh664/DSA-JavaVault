package Top_Tech_Inteview;

public class PrintFibonacci {

//    // 1 Way.
//    public static void main(String[] args) {
//        int n = 10; // numbers of fibonacci to print
//        int a = 0, b = 1;
//
//        System.out.print(a+" "+b+" ");
//        for (int i=2; i < n; i++){
//            int c = a + b;
//            System.out.print(c+" ");
//            a = b;
//            b = c;
//        }
//    }



    // 2nd way.
    public static void main(String[] args) {
        int n = 10; // print first 10 terms
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
    static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

}
