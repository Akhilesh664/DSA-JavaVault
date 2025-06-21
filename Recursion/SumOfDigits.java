package Recursion;

import java.util.Scanner;

public class SumOfDigits {

    public static int sumOfDigits(int n){
        if(n>=0 && n<=9){
            return n;
        }
        int div= sumOfDigits(n/10);
        int sum= (div)+ n%10;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();


        System.out.print("Sum of the digits: ");
        System.out.println(sumOfDigits(n));     //return type method
    }
}
