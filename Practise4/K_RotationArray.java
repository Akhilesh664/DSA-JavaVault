// O(n^2) : Time complexity : [n * k = O(n*n)] : here we consider k as worst as n so it will become n^2

package Practise4;

public class K_RotationArray {
	
	public static void main(String[] args) {

        int[] arr = {2, 8, 5, 6, 4, 9};
        int n = arr.length;
        int k = -2;

        // Normalize k for cases where k > n or k is negative
        k = k % n;  // In case k is larger than n
        if (k < 0) {
            k = k + n;  // If k is negative, convert it to a positive equivalent for right rotation
        }

        // + k rotation towards right
        if (k > 0) {
            for (int r = 1; r <= k; r++) {
                // Logic for rotating array right by one element
                int temp = arr[n - 1];  // Store the last element
                for (int i = n - 1; i >= 1; i--) {
                    arr[i] = arr[i - 1];  // Shift elements to the right
                }
                arr[0] = temp;  // Place the last element in the first position
            }
        }
    
		// printing array
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	//6 4 9 2 8 5 

}
