// O(n) : [Time complexity iterate arrays and performe some code]  
// O(1) : [Space complexity]

package Arrays;

public class AddIntegerIntoArray {
	public static void main(String[] args) {
		
		int[] arr = {4,5,2,0};
		int n = arr.length;
		int k = 83;
		
		for(int i = n-1; i >=0; i--) {
			int sum = arr[i] + k;
			arr[i] = sum%10;
			k = sum/10;

			if(k == 0) {
				break;
			}
		}
		for(int num : arr) {
			System.out.print(num +" ");
		}
	}
}
