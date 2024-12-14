package Part1;

import java.util.Scanner;

public class TheaterTicketCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of tickets: ");
        int numTickets = scanner.nextInt();

        if (numTickets < 5 || numTickets > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
//            return;
        }
        else 
        {
	        System.out.print("Do you want refreshment (y/n): ");
	        char refreshmentOption = scanner.next().charAt(0);
	
	        System.out.print("Do you have a coupon code (y/n): ");
	        char couponOption = scanner.next().charAt(0);
	
	        System.out.print("Enter the circle (k/q): ");
	        char circle = scanner.next().charAt(0);
	
	        double ticketPrice = 0.0;
	        switch (circle) {
	            case 'k':
	                ticketPrice = 75.0;
	                break;
	            case 'q':
	                ticketPrice = 150.0;
	                break;
	            default:
	                System.out.println("Invalid Input");
	//                return;
	        }
	
	        double totalCost = numTickets * ticketPrice;
	
	        if (numTickets > 20) {
	            totalCost *= 0.9; // Apply 10% discount
	        }
	
	        if (couponOption == 'y') {
	            totalCost *= 0.98; // Apply 2% discount for coupon
	        }
	
	        if (refreshmentOption == 'y') {
	            totalCost += numTickets * 50; // Add refreshment cost
	        }
	
	        System.out.printf("Ticket cost: %.2f%n", totalCost);
	
	        scanner.close();
        }

		
    }
}
