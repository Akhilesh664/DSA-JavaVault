package Top_Tech_Inteview;

public class Factorial {

//    // 1 Way. [Loop Method]
//    public static void main(String[] args) {
//        int n = 5;
//        int fact = 1;
//        for (int i = 1; i <= n; i++){
//            fact = fact * i;
//        }
//        System.out.println(fact);
//    }


    // 2 Way. [Recursive Method]
    public static void main(String[] args) {
        int n = 5;
        int factorial = fact(n);
        System.out.println("Factorial of " + n + " is " + factorial);
    }
    public static int fact(int n){
        if( n == 0 || n == 1){
            return 1;
        }
        return n*fact(n-1);
    }
}
