package LeetCode;

import java.util.*;

public class Q22 {

    static class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> row = new ArrayList<>();
            long num = 1;

            for (int j = 0; j <= rowIndex; j++) {
                row.add((int)num);
                num = num * (rowIndex - j) / (j + 1); // formula
            }

            return row;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.getRow(3));

    }
}