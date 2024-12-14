package Part2;
import java.util.Scanner;


public class CruiseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter input for time in Hour : ");
        // Input number of hours T
        int T = scanner.nextInt();
        
        // Input arrays for entering and leaving guests
        int[] E = new int[T];
        int[] L = new int[T];
        System.out.println("Enter input for array E[] : ");
        for (int i = 0; i < T; i++) {
            E[i] = scanner.nextInt();
        }
        System.out.println("Enter input for array L[] : ");
        
        for (int i = 0; i < T; i++) {
            L[i] = scanner.nextInt();
        }
        
        // Calculate the maximum number of guests at any instance
        int currentGuests = 0;
        int maxGuests = 0;
        
        for (int i = 0; i < T; i++) {
            currentGuests += E[i] - L[i];
            if (currentGuests > maxGuests) {
                maxGuests = currentGuests;
            }
        }
        
        // Output the maximum number of guests
        System.out.println(maxGuests);
        
        scanner.close();
    }
}
