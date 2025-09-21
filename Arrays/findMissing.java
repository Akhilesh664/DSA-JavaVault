package Arrays;

public class findMissing {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length + 1;
        int ExpectedSum = n * (n + 1)/ 2;

        int ActualSum = 0;

        for(int num : arr){
            ActualSum += num;
        }

        int result = ExpectedSum - ActualSum;
        System.out.println(result);

    }
}
