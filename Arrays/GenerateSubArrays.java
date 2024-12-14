// O(n^2) : Time complexity [n^2 : check the number of subarray by (n(n+1)/2) ~ n^2]  

package Arrays;

public class GenerateSubArrays {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int n = arr.length;
	
		for(int i = 0; i <= n-1; i++) {
			for(int j = i; j <= n-1; j++) {
				for(int k = i; k <= j; k++) {
					System.out.print( arr[k] + " " );
				}
				System.out.println();
			}
			System.out.println();
		}
				
	}

}
