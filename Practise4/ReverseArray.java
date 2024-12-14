package Practise4;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr = {3,4,5,2,4,6};
		int i = 0;
		int j = arr.length-1;

		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		// printing array
		for(i=0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
