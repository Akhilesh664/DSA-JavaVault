// O(3*n) : Time complexity [n * n * n : 3n]  
// O(n) : [Space complexity to store n nonzero elements in brr[]]

package Arrays;

public class ShiftAllZeroOneSide {
	
	public static void main(String[] args) {
        
        int[] arr = {1, 0, 2, 13, 0, 70, 0};
        int n = arr.length;
        int j = 0;
        
        // Create a new array to hold non-zero elements
        int[] brr = new int[n];
        
        // Copy non-zero elements to the new array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                brr[j] = arr[i];
                j++;
            }       
        }
        
        // Fill the original array with non-zero elements first
        for (int i = 0; i < j; i++) {
            arr[i] = brr[i];
        }
        
        // Fill the remaining part of the array with zeros
        for (int i = j; i < n; i++) {
            arr[i] = 0;
        }
        
        // Print the final array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
	
}
