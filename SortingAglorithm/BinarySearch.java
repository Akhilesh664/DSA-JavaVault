// O(log n) : Time complexity [log n ~ monotonic]  

package SortingAglorithm;

public class BinarySearch {
	
	public static void main(String[] args) {
	
		int[] arr = {2,5,6,7,8,10,23,45,67,89,100};
		int n = arr.length;
		int T = 2;
		
		int s = 0;
		int e = n-1;
		
		while(s <= e) {
			int m = (e + s)/2;
			
			if(arr[m] == T) {
				System.out.println("target found at index : "+m);
				break;
			}
			else if(arr[m] > T) {
				e = m-1;
			}
			else if(arr[m] < T) {
				s = m+1;
			}
			
		}
		if(s > e) {
			System.out.println("target not found ");
		}
		
	}
}
