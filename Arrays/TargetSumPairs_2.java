// [ ONLY FOR SORTED ARRAYS ]    O(n) : Time complexity [n : one loop and condition check (sum == T) ~ n]  

package Arrays;

public class TargetSumPairs_2 {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 20, 30, 40, 50, 60};
		int n = arr.length;
		int T = 40;
		int count = 0;
		
		int i = 0;
		int j = n-1;
		
		while(i < j) {
			if(arr[i] + arr[j] == T) {
				System.out.print("["+arr[i]+", "+arr[j]+"]");
				count++;
				i++;
				j--;
			}
			else if(arr[i] + arr[j] > T) {
				j--;
			}
			else if(arr[i] + arr[j] < T) {
				j++;
			}
		}
		
		System.out.println("\ncount : "+count);
	}	

}
