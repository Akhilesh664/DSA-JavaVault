package Recursion;

import java.util.*;

public class EvenNumbers {
    static void evenNum(int start, int end){
        if(start>end){
            return;
        }
        if(start%2==0){
            System.out.print(start+ " ");
        }
        evenNum(start+1, end);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter range start: ");
        int start= sc.nextInt();
        System.out.print("Enter range end: ");
        int end= sc.nextInt();

        evenNum(start, end);
    }
}
