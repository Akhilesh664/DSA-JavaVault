// O(n^2) : Time complexity [n^2 : outer + inner loop (sum) ~ n^2]  

package Arrays;

public class GeneratePairs {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int n = arr.length;
	
		for(int i = 0; i <= n-2; i++ ) {
			for(int j = i+1; j <= n-1; j++) {
				System.out.print("["+arr[i]+", "+arr[j]+"]");
			}
			System.out.println();
		}	 
	}
}
