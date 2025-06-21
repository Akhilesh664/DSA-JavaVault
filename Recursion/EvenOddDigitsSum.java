package Recursion;

import java.util.*;
public class EvenOddDigitsSum {

    static int evenSum(int n){
        if(n==0){
            return 0;
        }
        int sum= evenSum(n/10);
        if((n%10) %2 ==0){
            sum= sum+ n%10;
        }
        return sum;
    }

    static int oddSum(int n){
        if(n==0){
            return 0;
        }
        int sum= oddSum(n/10);
        if((n%10) %2 ==1){
            sum= sum+ n%10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        System.out.print("Sum of even digits: ");
        System.out.println(evenSum(num));

        System.out.print("Sum of odd digits: ");
        System.out.println(oddSum(num));
    }
}
