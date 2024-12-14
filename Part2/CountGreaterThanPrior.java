package Part2;

import java.util.Scanner;

public class CountGreaterThanPrior {
	public static void main(String[] args) 
	{
		System.out.println("Enter number of elements in array N : ");
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int[] arr = new int[N];

		for(int i = 0; i<N; i++){
			arr[i] = s.nextInt();
		}
		
		System.out.println(countGreater(arr));
	
//		for(int i = 0; i<N; i++){
//			System.out.println(arr[i]);
//		}
		
		s.close();
		
	}

	private static int countGreater(int[] arr) {
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			int key = arr[0];
			if(key <= arr[i]) {
				count++;
			}
		}
		return count;
		
	}

}
