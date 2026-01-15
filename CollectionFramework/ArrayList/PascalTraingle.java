package CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class PascalTraingle {

      // 1 Way
//    public static void main(String[] args) {
//        int n = 6;
//        List<Integer> prev = new ArrayList<>();
//
//        for(int i = 0; i < n; i++){
//            List<Integer> curr = new ArrayList<>();
//            for(int j = 0; j <= i; j++){
//
//                if(j == 0 || j == i) {
//                    curr.add(1);
//                }else{
//                    int val = prev.get(j-1) + prev.get(j);
//                    curr.add(val);
//                }
//            }
//            System.out.println(curr);
//            prev = curr;
//        }
//
//    }


    // 2 way
    public static void main(String[] args) {
        int n = 5; // number of rows
        for (int i = 0; i < n; i++) {
            int num = 1; // first element is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1); // your formula
            }
            System.out.println();
        }
    }

}
