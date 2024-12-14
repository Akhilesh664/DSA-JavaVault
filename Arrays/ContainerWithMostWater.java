//O(n) : Time complexity  
package Arrays;

public class ContainerWithMostWater {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		int n = arr.length;
		
		// index of chart
		int i = 0;
		int j = n-1;
		int lsf = Integer.MIN_VALUE;
		int[] index = new int[2]; 
		
		while(i < j) {
			// width = j-i
			int w = j-i;
			// finding min ht as small ht is common in both which can play role as ht of container   
			int h = Math.min(arr[i], arr[j]);
			// area by w*h
			int a = w * h;
			
			// if lsf < a then put a in it will iterate and find ultimate max area from chart
			if(lsf < a) {
				lsf = a;
				index[0] = i;// for printing index
				index[1] = j;	
			}
			if(arr[i] < arr[j]) { // as we want to increase ht 
				i++;
			}else {
				j--;
			}
			
		}
		System.out.println("Countainer with max water is : " + lsf);
		System.out.println("Index which holds max water : "+index[0]+", "+index[1]);
		
		
	}		

}
