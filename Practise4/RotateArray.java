package Practise4;

public class RotateArray {
	
	public static void main(String[] args) {
		
		int[] arr = {3,4,5,2,4,6};
		int n = arr.length;
		
		// logic : shifting elements towards right
		int temp = arr[n-1];
		for(int i = n-1; i>=1; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		
		// printing array
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
