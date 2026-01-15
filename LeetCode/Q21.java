package LeetCode;

import java.util.*;

public class Q21 {

    static class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> Triangle = new ArrayList<>(); // List

            for (int i = 0; i < numRows; i++) {
                List<Integer> row = new ArrayList<>();
                int number = 1; // first no. is 1

                for (int j = 0; j <= i; j++) {
                    row.add(number);
                    // calculate C(i, j+1) using C(i, j)
                    number = number * (i - j) / (j + 1); // binomial coefficient formula

                }
                Triangle.add(row);
            }

            return Triangle;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.generate(5));

    }
}
