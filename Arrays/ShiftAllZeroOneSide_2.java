// O(2*n) : Time complexity [n * n : for and while loop]  
// O(1) : space complexity

package Arrays;

public class ShiftAllZeroOneSide_2 {

//  Approach - 1
//
//	public static void main(String[] args) {
//		
//		int[] arr = {1, 0, 0, 13, 0, 70, 0};
//		int n = arr.length;
//		
//		int j = 0;// fixing values in same array
//		for(int i = 0; i < n; i++) {
//			if(arr[i] != 0) {
//				arr[j] = arr[i];
//				j++;
//			}		
//		}
//		
//		while(j<n) {
//			arr[j] = 0;
//			j++;
//		}
//		
//		for(int num: arr) {
//			System.out.print(num+" ");
//		}
// 	}
	
//  Approach - 2
	public static void main(String[] args) {
		
		int[] arr = {1, 0, 0, 13, 0, 70, 0};
		int n = arr.length;
		
		int j = -1;// fixing values in same array
		for(int i=1; i<n; i++) {
			if(arr[i] == 0) {
				j = i;
				break;
			}
		}
		
		if(j < 0) {
			System.out.println("invalid array no zero in side");
		}
		
		for(int i = j+1; i < n; i++) {
			if(arr[i] != 0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				j++;
			}		
		}
				
		
		for(int num: arr) {
			System.out.print(num+" ");
		}
 	}
	
}
