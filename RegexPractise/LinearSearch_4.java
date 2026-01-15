package RegexPractise;

import java.util.Scanner;

//Linear Search
//find the element 'x' in array,
//take Array and x as input
public class LinearSearch_4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = s.nextInt();
        System.out.println("Enter the Target:");
        int x = s.nextInt();

        int[] arr = new int[n];
        System.out.println("Input Array Element:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        boolean flag = false; // not found
        for(int i=0; i<n; i++) {
        	if(arr[i] == x) {
                flag=true;
        		System.out.println("Target found at index : "+i);
        		break;
        	}
        }

        if(flag == true) {
            System.out.println("Target found");
        }else {
            System.out.println("Target not found");
        }


    }

}
