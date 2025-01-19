package LeetCode;

import java.util.Arrays;
import java.util.HashMap;


public class ArrayRankTransform_1331 {
	
	
	public static void main(String[] args) {
		
		int[] arr = {40, 10, 20, 30};
		
		 int[] brr = ArrayRankTransform(arr);
		
		for (int num : brr) {
			System.out.println(num + "  ");
		}
	}

	private static int[] ArrayRankTransform(int[] arr) {
		
		// Create a copy of the original array
		int[] sortedArr = Arrays.copyOf(arr, arr.length);
		
		// Sort the copied array
		Arrays.sort(sortedArr);
		
		// Map to store ranks for the values
		HashMap<Integer, Integer> rankMap = new HashMap<>();
		
		// Assign ranks starting from 1 for unique values in sorted array
		int rank = 1;
		for (int num : sortedArr) {
			if (!rankMap.containsKey(num)) {
				rankMap.put(num, rank++);
			}
		}
		
		// Prepare the result array with ranks from the original array
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			result[i] = rankMap.get(arr[i]);
		}
		
		return result;
	}
}


