package Part2;

import java.util.Scanner;

public class TrafficFineCalculator {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the number of vehicles
	        System.out.println("Enter the number of vehicles (N):");
	        int N = scanner.nextInt();

	        // Input the last digit of each vehicle's registration number
	        int[] a = new int[N];
	        System.out.println("Enter the last digit of each vehicle's registration number:");
	        for (int i = 0; i < N; i++) {
	            a[i] = scanner.nextInt();
	        }

	        // Input the date
	        System.out.println("Enter the date (D):");
	        int D = scanner.nextInt();

	        // Input the fine amount
	        System.out.println("Enter the fine amount (X):");
	        int X = scanner.nextInt();

	        // Calculate the total fine collected
	        int totalFine = calculateTotalFine(a, N, D, X);

	        // Output the total fine
	        System.out.println("Total fine collected: " + totalFine);

	        scanner.close();
	    }

	private static int calculateTotalFine(int[] a, int n, int d, int x) {
		// 1st Way
//		if(d%2 == 0) {
//			// even function
//			int count = 0;
//			for(int i=0; i<n; i++) {
//				if(a[i]%2 != 0) {
//					count++;
//				}
//			}
//			int fine = count * x;
////			System.out.println(fine);
//			return fine;
//		}else {
//			// odd function
//			int count = 0;
//			for(int i=0; i<n; i++) {
//				if(a[i]%2 == 0) {
//					count++;
//				}
//			}
//			int fine = count * x;
////			System.out.println(fine);
//			return fine;
//		}
		
		// 2nd Way
		int totalFine = 0;
        boolean isEvenDate = (d % 2 == 0);

        for (int i = 0; i < n; i++) {
            boolean isEvenNumber = (a[i] % 2 == 0);

            // Check if the vehicle violates the rule
            if ((isEvenDate && !isEvenNumber) || (!isEvenDate && isEvenNumber)) {
                totalFine += x;
            }
        }

        return totalFine;
    
	
}
	 
	 

}
