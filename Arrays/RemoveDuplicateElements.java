// O( n ) : Time complexity [n : for loop checking prev. element is it similar to present one or not]  
// O( 1 ) : space complexity

package Arrays;

//import java.util.Arrays;

public class RemoveDuplicateElements {
	public static void main(String[] args) {

		int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 9};
		int n = arr.length;

//		Arrays.sort(arr); // ****if array is not sorted ; [ n_log(n) complexity if comment out ]
		
		int idx = 1;
		for(int i = 1; i< n; i++) {
			if(arr[i] != arr[i-1]) {
				arr[idx] = arr[i];
				idx++;
			}
		}
		
		for(int i =0; i<idx; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
 