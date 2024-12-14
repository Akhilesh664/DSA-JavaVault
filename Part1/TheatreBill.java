package Part1;

import java.util.Scanner;

public class TheatreBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define prices
        final int PIZZA_PRICE = 100;
        final int PUFF_PRICE = 20;
        final int COOL_DRINK_PRICE = 10;

        // Get user input
        System.out.print("Enter the number of pizzas bought: ");
        int numberOfPizzas = scanner.nextInt();

        System.out.print("Enter the number of puffs bought: ");
        int numberOfPuffs = scanner.nextInt();

        System.out.print("Enter the number of cool drinks bought: ");
        int numberOfCoolDrinks = scanner.nextInt();

        // Calculate total price
        int totalPrice = (numberOfPizzas * PIZZA_PRICE) +
                         (numberOfPuffs * PUFF_PRICE) +
                         (numberOfCoolDrinks * COOL_DRINK_PRICE);

        // Display the bill details
        System.out.println("Bill Details");
        System.out.println("No of pizzas: " + numberOfPizzas);
        System.out.println("No of puffs: " + numberOfPuffs);
        System.out.println("No of cooldrinks: " + numberOfCoolDrinks);
        System.out.println("Total price = " + totalPrice);
        System.out.println("ENJOY THE SHOW!!!");

        scanner.close();
    }
}

