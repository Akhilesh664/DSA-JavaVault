package Extra;

import java.util.Arrays;
import java.util.Scanner;


public class TwoSumTarget {

    public int[] twoSum(int[] arr, int target) 
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[i]+arr[j] == target)
                {
                    return new int[]{i,j};        
                }
            }
        }    
        return new int[]{};
    }

    public static void main (String[] args)
    {
        TwoSumTarget sol = new TwoSumTarget();

        // array
        int[] arr = {10,20,30,40,50};
        int target = 30;

        int[] result = sol.twoSum(arr, target);

        for(int item : arr) 
        {
        	System.out.print(item+" ");
        }
        System.out.println();
//        for(int i = 0; i <= arr.length; i++) 
//        {
//        	System.out.println(arr[i]);
//        }
        System.out.println("target : "+target);
        System.out.println("Indices of the two numbers: "+ Arrays.toString(result));
    } 
}
