package RegexPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrefixSum_12 {

    // 1st Way [using new Prefix Array]
//    public static void main(String[] args) {
//
//        int[] arr = {1,  2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] prefixSum = new int[arr.length];
//
//        prefixSum[0] = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            prefixSum[i] = prefixSum[i - 1] +arr[i];
//        }
//
//        System.out.println(Arrays.toString(prefixSum));
//    }


    // 2nd Way [modification of same array]
//    public static void main(String[] args) {
//        int[] arr = {2, 4, 6, 8};
//
//        for (int i = 1; i < arr.length; i++) {
//            arr[i] = arr[i] + arr[i - 1];   // modify original array
//        }
//
//        System.out.print("Prefix Array: ");
//        for (int x : arr) System.out.print(x + " ");
//    }


    // 3rd Way [using lambda expression]
//    public static void main(String[] args) {
//        int[] arr = {2, 4, 6, 8};
//
//        final int[] running = {0};  // final array to mutate inside lambda
//        int[] prefix = IntStream.of(arr)
//                .map(x -> running[0] += x)
//                .toArray();
//
//        System.out.println("Prefix Array: " + Arrays.toString(prefix));
//    }


    // 4th Way [using List]
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        List<Integer> prefix = new ArrayList<>();

        int sum = 0;
        for (int x : arr) {
            sum += x;
            prefix.add(sum);
        }
        System.out.println("Prefix List: " + prefix);
    }

}
