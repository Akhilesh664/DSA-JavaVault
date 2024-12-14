package Part1;

import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter value for a and b : ");

        // Read input values
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Validate inputs
        if (a >= b || a <= 0 || b <= 0) {
            System.out.println("Provide valid input");
            return;
        }

        // Find and print prime numbers in the range [a, b]
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
