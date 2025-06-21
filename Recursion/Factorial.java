package Recursion;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fact = n * factorial(n-1);
        return fact;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        System.out.print("Factorial of " + n + " is: ");
        System.out.println(factorial(n));
    }
}
