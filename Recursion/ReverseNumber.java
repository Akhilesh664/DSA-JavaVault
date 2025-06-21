package Recursion;

import java.util.Scanner;

public class ReverseNumber {
    static void reverseNum(int n){
        if(n==0){
            return;
        }
        System.out.print(n%10);
        reverseNum(n/10);

    }

    static int reverseNumber(int n, int rev) {
        if (n == 0) return rev;
        return reverseNumber(n / 10, rev * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        System.out.println("Reversing the number... ");

        reverseNum(n);
        System.out.println();
        System.out.println(n);//void method
        System.out.println(reverseNumber(n, 0));       //return type method
    }
}
