package Recursion;

import java.util.*;

//if n is even → add
//if n is odd → subtract
public class AlternateSignOperation {
    static int operate(int n){
        if(n==1){
            return 1;
        }
        if(n%2==0){
            return operate(n-1) + n;
        }
        else{
            return operate(n-1) - n;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        System.out.println(operate(n));
    }
}