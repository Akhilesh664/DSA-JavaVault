package Recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    static int rangeSum(int start, int end){
        if(start>end){
            return 0;
        }
        return rangeSum(start+1, end) + start;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start= sc.nextInt();
        System.out.print("Enter ending number: ");
        int end= sc.nextInt();
        System.out.print("Sum of numbers from " + start + " to " + end + ": ");
        System.out.println(rangeSum(start, end));
    }
}
