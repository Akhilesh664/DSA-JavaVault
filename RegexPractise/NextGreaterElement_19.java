package RegexPractise;

import java.util.Arrays;

public class NextGreaterElement_19 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3};
        int n = arr.length;
        int[] res = new int[n];

        Arrays.fill(res, -1);

        for(int i = 0; i < n; i++) {
            for(int j = i-1; j>=0 ; j--){
                if(arr[j] < arr[i] && res[j] == -1){
                    res[j] = arr[i];
//                    break;
                }
            }
        }
        for(int i : res){
            System.out.print(i+" ");
        }

    }
}
