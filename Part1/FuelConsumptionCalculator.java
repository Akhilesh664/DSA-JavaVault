package Part1;

import java.util.Scanner;

public class FuelConsumptionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of liters to fill the tank
        System.out.println("Enter the number of liters to fill the tank:");
        float liters = scanner.nextFloat();

        // Validate the input for liters
        if (liters <= 0) {
            System.out.printf("%.0f is an Invalid Input%n", liters);
            return;
        }

        // Prompt the user to enter the distance covered
        System.out.println("Enter the distance covered:");
        float distanceInKilometers = scanner.nextFloat();

        // Validate the input for distance
        if (distanceInKilometers <= 0) {
            System.out.printf("%.0f is an Invalid Input%n", distanceInKilometers);
            return;
        }

        // Calculate liters per 100 kilometers
        float litersPer100KM = (liters / distanceInKilometers) * 100;

        // Convert kilometers to miles
        float distanceInMiles = distanceInKilometers * 0.6214f;

        // Convert liters to gallons
        float gallons = liters * 0.2642f;

        // Calculate miles per gallon
        float milesPerGallon = distanceInMiles / gallons;

        // Display the results
        System.out.println("Liters/100KM");
        System.out.printf("%.2f%n", litersPer100KM);
        System.out.println("Miles/gallons");
        System.out.printf("%.2f%n", milesPerGallon);

        scanner.close();
    }
}
