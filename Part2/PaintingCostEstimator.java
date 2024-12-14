package Part2;

import java.util.Scanner;

public class PaintingCostEstimator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for cost per square foot
        final double INTERIOR_COST_PER_SQFT = 18.0;
        final double EXTERIOR_COST_PER_SQFT = 12.0;

        // Input for the number of interior walls
        System.out.println("Enter the number of interior walls:");
        int numInteriorWalls = scanner.nextInt();
        
        // Input for the number of exterior walls
        System.out.println("Enter the number of exterior walls:");
        int numExteriorWalls = scanner.nextInt();


        // Input for the surface area of each interior wall if applicable
        double totalInteriorArea = 0.0;
        if (numInteriorWalls > 0) {
            System.out.println("Enter the surface area of each interior wall in square feet:");
            for (int i = 0; i < numInteriorWalls; i++) {
                double area = scanner.nextDouble();
                totalInteriorArea += area;
            }
        }

        
        // Input for the surface area of each exterior wall if applicable
        double totalExteriorArea = 0.0;
        if (numExteriorWalls > 0) {
            System.out.println("Enter the surface area of each exterior wall in square feet:");
            for (int i = 0; i < numExteriorWalls; i++) {
                double area = scanner.nextDouble();
                totalExteriorArea += area;
            }
        }

        // Calculate the total cost
        double totalInteriorCost = totalInteriorArea * INTERIOR_COST_PER_SQFT;
        double totalExteriorCost = totalExteriorArea * EXTERIOR_COST_PER_SQFT;
        double totalCost = totalInteriorCost + totalExteriorCost;

        // Display the total estimated cost
        System.out.printf("Total estimated cost: %.1f INR%n", totalCost);

        scanner.close();
    }
}

