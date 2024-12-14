// O(n^3) : Time complexity [n^3 : outer + inner1 + inner2 loop (sum) ~ n^3]  

package Arrays;

public class MaximumSubArraySum {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int n = arr.length;
		int lsf = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				int sum = 0;
				for(int k = i; k <= j; k++) {
					sum = sum + arr[k];
					if(sum > lsf) {
						lsf = sum;
//						System.out.println( arr[k] + " " );
					}
					
				}
			}
		}
		
		System.out.print("Maximum SubArraySum (lsf) : "+lsf);
	}

}
