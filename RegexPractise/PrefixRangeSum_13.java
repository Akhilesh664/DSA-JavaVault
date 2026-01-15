package RegexPractise;

public class PrefixRangeSum_13 {

    public static int rangeSum(int[] prefix, int i, int j){
        if(i == 0){
            return prefix[j]; // if i = 0 then return the sum [on staritng index to end index ]
        }
        else{
            return prefix[j] - prefix[i-1]; // prefix [i-1] because we want the sum of the range between[i, j]
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        // we created a prefix array
        System.out.println(rangeSum(prefix, 1, 3));
    }
}
