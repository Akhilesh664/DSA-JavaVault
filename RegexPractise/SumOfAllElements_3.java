package RegexPractise;

//calculate the sum of all elements in given array
//arr [81,17,95, 36, 31, 100, 50]

public class SumOfAllElements_3 {

    public static void main(String[] args) {

        int[] arr = {81, 17, 95, 36, 31, 100, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of elements = " + sum);
    }
}
