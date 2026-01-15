package Top_Tech_Inteview;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddFinder {

    // 1 Way.
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 5, 6, 7, 8, 12, 13, 14, 17, 18, 19, 25};
//        ArrayList<Integer> even = new ArrayList<>();
//        ArrayList<Integer> odd = new ArrayList<>();
//
//        for (int n : arr) {
//            if (n % 2 == 0) {
//                even.add(n);
//            } else {
//                odd.add(n);
//            }
//        }
//        System.out.println("even:"+ even);
//        System.out.println("odd:"+ odd);
//    }




    // 2 Way.
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 5, 6, 7, 8, 12, 13, 14, 17, 18, 19, 25};
//
//         List<Integer> evens = Arrays.stream(arr)
//                 .filter(n -> n%2 == 0)
//                 .boxed()                     // converting int to Integer
//                 .collect(Collectors.toList());
//
//
//        List<Integer> odds = Arrays.stream(arr)
//                .filter(n -> n%2 != 0)
//                .boxed()                      // converting int to Integer
//                .collect(Collectors.toList());
//
//        System.out.println("even:"+ evens);
//        System.out.println("odd:"+ odds);
//    }




    // 3 Way.
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 5, 6, 7, 8, 12, 13, 14, 17, 18, 19, 25};
//
//        int[] evens = Arrays.stream(arr).filter(n -> n % 2 == 0).toArray();
//        int[] odds = Arrays.stream(arr).filter(n -> n % 2 != 0).toArray();
//
//        System.out.println("even:"+ Arrays.toString(evens));
//        System.out.println("odd:"+ Arrays.toString(odds));
//    }

}
