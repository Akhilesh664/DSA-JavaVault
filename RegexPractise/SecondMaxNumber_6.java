package RegexPractise;

import org.w3c.dom.ls.LSOutput;

//find the second maximum values out of the elements  in array
public class SecondMaxNumber_6 {

    public static void main(String[] args) {

        int[] arr = {81, 17, 95, 36, 31, 100, 500};

        int n = arr.length;
//        int max = arr[0];
        int max = Integer.MIN_VALUE;
        int scndMax = Integer.MIN_VALUE;
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                scndMax = max;
                max = arr[i];
            }
            else if(arr[i] > scndMax && arr[i] < max) {
                scndMax = arr[i];
            }
        }

        System.out.println("Second Maximum Number is : "+scndMax);

    }

}
