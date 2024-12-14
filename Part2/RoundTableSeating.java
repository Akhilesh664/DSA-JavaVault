package Part2;

import java.util.Scanner;

public class RoundTableSeating {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of members (N)
        System.out.println("Enter the number of members (N):");
        int N = scanner.nextInt();

        // Calculate and output the number of seating arrangements
        long possibleWays = calculateSeatingWays(N);
        System.out.println("Possible ways to seat the members: " + possibleWays);
    }

    public static long calculateSeatingWays(int N) {
        if (N < 2) {
            return 0; // There cannot be a seating arrangement if less than 2 members
        }

        // 2! ways to arrange the President and Prime Minister
        long pairWays = 2;

        // (N-2)! ways to arrange the rest of the members and the pair as a single unit
        long arrangementWays = factorial(N - 1);

        // Total possible ways
        return pairWays * arrangementWays;
    }

    public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
