package Part2;

import java.util.Scanner;

public class ChocolateFactory {
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        // Input the value of N
        System.out.println("Enter the number of elements (N):");
        int N = scanner.nextInt();

        // Input the elements of the array
        int[] arr = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Move zeros to the end of the array
        moveZerosToEnd(arr);

        // Output the result
        System.out.println("Array after moving zeros to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

	public static void moveZerosToEnd(int[] arr) {
		
		int nonZeroIndex = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != 0) {
				int temp = arr[nonZeroIndex];
				arr[nonZeroIndex] = arr[i];
				arr[i] = temp;
				
				nonZeroIndex++;
		}
	}
		
}
		


}
