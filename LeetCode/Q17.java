package LeetCode;

import java.util.*;

public class Q17 {

    static class Solution {

        public int[][] merge(int[][] intervals) {
            if (intervals.length <= 1){
                return intervals;
            }

            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
            int[] cur = intervals[0];

            List<int[]> res = new ArrayList<>();


            for (int i = 1; i < intervals.length; i++) {
                int[] next  =intervals[i];

                if (next[0] <= cur[1]) {
                    cur[1] = Math.max(cur[1], next[1]);
                } else {
                res.add(cur);
                    cur = next;
                }
            }

            res.add(cur); // add the lst interval

//            return res.toArray(res.size()[]);
            return res.toArray(new int[res.size()][]);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[][] intervals1 = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(s.merge(intervals1)));

    }
}