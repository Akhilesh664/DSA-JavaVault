package Part2;
import java.util.Scanner;

public class VehicleProduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the total number of vehicles
        System.out.println("Enter the total number of vehicles (V):");
        int V = scanner.nextInt();

        // Input the total number of wheels
        System.out.println("Enter the total number of wheels (W):");
        int W = scanner.nextInt();

        // Check for invalid input conditions
        if (W < 2 || W % 2 != 0 || V >= W) {
            System.out.println("INVALID INPUT");
        } else {
            // Calculate the number of four-wheelers and two-wheelers
            int FW = (W - 2 * V) / 2;
            int TW = V - FW;

            // Check if the calculated numbers are valid
            if (FW >= 0 && TW >= 0) {
                System.out.println("TW = " + TW + " FW = " + FW);
            } else {
                System.out.println("INVALID INPUT");
            }
        }

        scanner.close();
    } 
}
