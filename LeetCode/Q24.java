package LeetCode;

public class Q24 {

    static class Solution {
        public String convert(String s, int numRows) {
            if (s.length() <= numRows || numRows == 1) {
                return s;
            }

            StringBuilder[] rows = new StringBuilder[numRows];

            for (int i = 0; i < numRows; i++) {
                rows[i] = new StringBuilder();
            }

            int row = 0;
                    int dir = 1;
                    // dir: 1 = for goimg down, -1 = for going up

            for (char ch : s.toCharArray()) {
                rows[row].append(ch);

                if (row == 0) {
                    dir = 1;
                } else if (row == numRows - 1)
                {
                    dir = -1;
                }

                row = row + dir;
            }

            // save it in a string
            StringBuilder result = new StringBuilder();
            for (StringBuilder sb : rows) {
                result.append(sb);
            }

            return result.toString();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "PAYPALISHIRING";
        int numRows = 3;
        String result = sol.convert(s, numRows);

        System.out.println(result);
    }
}
