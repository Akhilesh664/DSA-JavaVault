// O(n^2) : Time complexity [n^2 : outer + inner loop (sum) ~ n^2]  

package Arrays;

public class TargetSumPairs {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50, 30};
		int n = arr.length;
		int T = 50;
		
		int count= 0;
		for(int i = 0; i <= n-2; i++ ) {
			for(int j = i+1; j <= n-1; j++) {
				if(T ==(arr[i] + arr[j])) {
					System.out.print("["+arr[i]+", "+arr[j]+"]");
					count++;
				}
			}
		}	
		System.out.println("\ncount:"+count);
	}

}
