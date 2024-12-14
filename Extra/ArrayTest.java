import java.util.Scanner;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		
		// making array
		System.out.println("enter the size of array : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] arr = new int[n];
		
		// inserting elements
		System.out.println("Enter the elements for array : ");
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		// displaying array
		System.out.println("Array : ");
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		for(int num : arr) {
			System.out.print(num+" ");
		}
		
	}

}
