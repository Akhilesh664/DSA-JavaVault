package Part2;

import java.util.Scanner;


public class CandyJar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int N = 10; // Maximum capacity of the jar
        final int K = 5;  // Minimum candies required in the jar before refill
        int candiesInJar = N; // Current number of candies in the jar
        
        while (true) {
            System.out.println("Enter number of candies to buy: ");
            int candiesToBuy = scanner.nextInt();

            if (candiesToBuy > 0 && candiesToBuy <= candiesInJar) {
                // Process the purchase
                candiesInJar -= candiesToBuy;
                System.out.println("NUMBER OF CANDIES SOLD: " + candiesToBuy);
                
                // Check if the jar needs refilling
                if (candiesInJar <= K) {
                    candiesInJar = N;
                    System.out.println("The jar has been refilled.");
                }
                
                System.out.println("NUMBER OF CANDIES AVAILABLE: " + candiesInJar);
            } else {
                // Invalid input case
                System.out.println("INVALID INPUT");
                System.out.println("NUMBER OF CANDIES LEFT: " + candiesInJar);
            }

            // Optional: Break out of the loop if you want to stop the simulation
            System.out.println("Do you want to continue? (yes/no): ");
            String continueInput = scanner.next();
            if (!continueInput.equalsIgnoreCase("yes")) {
            	System.out.println("Thanks, Bye");
                break;
            }
        }
        
        scanner.close();
    }
}
