package Recursion;

import java.util.Scanner;

public class NaturalNumbers {

    static void NaturalNo(int n){
        if(n == 0){
            return;
        }
        // If you want *[n -> 1] order as first number printing then decrement happens
        System.out.println(n);
        NaturalNo(n-1);

        // If you want *[1 -> n] order as first decrementing number then printing happens
//        System.out.println(n);
//        NaturalNo(n-1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        NaturalNo(n);
    }

}
