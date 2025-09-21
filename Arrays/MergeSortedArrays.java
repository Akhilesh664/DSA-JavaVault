// O( n + m ) : [Time complexity iterate in both arrays ]  
// O( n + m ) : [Space complexity to store m+n elements in crr[] array[n+m] ]

package Arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		
		int[] arr = {10,30,50,80,100};
		int m = arr.length;
		
		int[] brr = {20,40,60,70,101,200};
		int n = brr.length;
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		int[] crr = new int[n+m];
		
		while(i < m && j < n) {
			if(arr[i] < brr[j]) {
				crr[k] = arr[i];
				k++;
				i++;
			}else {
				crr[k] = brr[j];
				k++;
				j++;
			}
		}
		
		while(i < m) {
			crr[k] = arr[i];
			k++;
			i++;
		}
		
		while(j < n) {
			crr[k] = brr[j];
			k++;
			j++;
		}
		
		for(int num : crr) System.out.print(num+" ");
		
	}
	
}
