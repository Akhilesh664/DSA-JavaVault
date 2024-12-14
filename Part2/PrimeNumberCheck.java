package Part2;

import java.util.Scanner;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        check(number);
        scanner.close();
    }

    // Function to check if the number is positive or negative
    public static void check(int number) {
        if (number < 0) {
            System.out.println("Please enter a positive number.");
        } else {
            if (prime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }

    
    // Function to check if the number is prime
    public static boolean prime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
