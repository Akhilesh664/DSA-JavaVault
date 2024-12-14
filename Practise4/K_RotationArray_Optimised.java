// O(n): Time complexity [n + k + (n-k)]

package Practise4;

public class K_RotationArray_Optimised {
	
	public static void main(String[] args) {	
	
		int[] arr = {2,8,5,6,4,9};
		int n = arr.length;
		int k = 2; //rotation
		
		k = k % n;
		
		// first reverse array
		int i = 0;
		int j = n-1;

		// rotate full array (0 to n-1)
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		// first range 0 - k
		int i1 = 0;
		int j1 = k-1;
		for(i1=0; i1<j1; i1++) {
			swap(arr, i1, j1);
			i1++;
			j1--;
		}
		
		
		// second range k-(n-1)
		int i2 = k;
		int j2 = n-1;
		for(i2=k; i2<j2; i2++) {
			swap(arr, i2, j2);
			i2++;
			j2--;
		}
		
		for(int num : arr) {
			System.out.print(num+" ");
		}

	}

	 public static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	 }
	 
	 //6 4 9 2 8 5 

}
