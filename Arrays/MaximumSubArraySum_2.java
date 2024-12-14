// O(n^2) : Time complexity [n^2 : outer loop + inner loop +o(1) work done by formula inside it ~ O(n^2)]  

package Arrays;

public class MaximumSubArraySum_2 {

	public static void main(String[] args) {
	
		int[] arr = {10, 20, 30, 40, 50};
		int n = arr.length;
		
		// creating Csum array of (n+1)
		int[] Csum = new int[n+1];
		
		Csum[0] = 0;
		// adding value in Csum array by this formula 
		for(int i=1; i<=arr.length; i++) {
			Csum[i] = Csum[i-1] + arr[i-1];
		}
		
		int lsf = Integer.MIN_VALUE;
		
		// outer loop
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				int sum = Csum[j+1] - Csum[i]; // formula which give S_ij = Csum[j+1] - Csum[i] it will give difference range sum which is maximum  
				if(sum > lsf) {
					lsf = sum;
				}
			}
		}
		
		System.out.print("Maximum SubArraySum (lsf) : "+lsf);
	}

}
