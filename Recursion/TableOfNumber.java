package Recursion;

import java.util.Scanner;

public class TableOfNumber {

    static void Table(int n, int number){
        if(number > 10){
            return;
        }
        System.out.println(n + " x " + number + " = " + number*n);
        Table(n, number+1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number for table: ");
        int n = s.nextInt();
        System.out.print("Table of " + n + " is: ");
        Table(n, 1);
    }
}
