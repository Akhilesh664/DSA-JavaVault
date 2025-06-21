// O(n*2^n) : Time complexity [n*2^n]  

package Arrays;

public class ArraySubsequences {
	static void generateSubsequences(int arr[], int n) {

		for(int num=0; num<(1<<n); num++) {
			for(int k=0; k<n; k++) {
				if(((num >> k) & 1) == 1) {
					// kth bit of num is set
					System.out.print(arr[k]+" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		int n = arr.length;
		
		generateSubsequences(arr, n);
	}
}
