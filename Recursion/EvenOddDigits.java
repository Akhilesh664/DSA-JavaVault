package Recursion;

import java.util.*;
public class EvenOddDigits {

    static void evenDigits(int n) {
        if (n == 0) {
            return;
        }
        evenDigits(n /10);
        if ((n % 10) % 2 == 0) {
            System.out.print(n%10 + " ");
        }
    }

    static void oddDigits(int n) {
        if (n == 0) {
            return;
        }
        oddDigits(n /10);
        if ((n % 10) % 2 == 1) {
            System.out.print(n%10 + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();
        System.out.print("Even digits: ");
        evenDigits(num);
        System.out.println();
        System.out.print("Odd digits: ");
        oddDigits(num);
    }
}