package RegexPractise;

import java.util.Scanner;

// Regex Test - 2 [Factorial Number]

public class FactorialNumber_2 {

    // I Approach
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long Factorial = 1;

        for(int i = 1; i <= n; i++) {
            Factorial = Factorial * i;
        }

        if(n >= 1) {
            System.out.println(Factorial);
        }
        else{
            System.out.println("Number should be bigger then 0 and non-negative.");
        }
    }

    // II Approach

//    public static int Factorial(int n) {
//
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            return n * Factorial(n - 1);
//        }
//
//    }
//
//
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//        int Factorial = 1;
//
//        System.out.println(Factorial(n));
//    }
}
