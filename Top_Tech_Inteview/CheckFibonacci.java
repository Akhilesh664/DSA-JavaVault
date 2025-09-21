package Top_Tech_Inteview;

public class CheckFibonacci {
    // 1 Way. [Mathematical way] - Recommended*
    public static void main(String[] args) {
        int n = 13;
        if (isFibonacci(n))
            System.out.println(n + " is a Fibonacci Number");
        else
            System.out.println(n + " is not a Fibonacci Number");
    }
    static boolean isFibonacci(int n) {
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }
    static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return s * s == x;
    }



//    // 2nd way. [Recursive way] - Not recommended
//    public static void main(String[] args) {
//        int n = 13;
//        if (isFibonacci(n))
//            System.out.println(n + " is a Fibonacci Number");
//        else
//            System.out.println(n + " is not a Fibonacci Number");
//    }
//    static boolean isFibonacci(int n) {
//        return checkFib(n, 0, 1);
//    }
//    static boolean checkFib(int n, int a, int b) {
//        if (a == n || b == n) return true;
//        if (b > n) return false;
//        return checkFib(n, b, a + b);
//    }

}
