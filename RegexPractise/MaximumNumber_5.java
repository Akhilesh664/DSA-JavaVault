package RegexPractise;

//find the maximum values out of the elements  in array
public class MaximumNumber_5 {

    public static void main(String[] args) {

        int[] arr = {81, 17, 95, -36, 31, 100, -500};

        int n = arr.length;
//        int max = arr[0];
        int max = Integer.MIN_VALUE;

        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum Number is : "+max);
    }


}
