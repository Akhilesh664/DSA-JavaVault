package LeetCode;

import java.util.Arrays;

public class Q25 {
    static class Solution {
        public String multiply(String num1, String num2) {
            if (num1.equals("0") || num2.equals("0"))
            {
                return "0";
            }

            int l1 = num1.length();
            int l2 = num2.length();
            int[] result = new int[l1 + l2]; // made full size array combining num1,2 lengths;

            for (int i = l1 - 1; i>=0; i--) {

                for (int j = l2 - 1; j>= 0;j--) {
                    int positon1 = i + j;

                    int positon2 = i + j + 1;

                    int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                    int sum = product + result[positon2];

                    result[positon2] = sum % 10;
                    result[positon1] += sum / 10;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int numbs : result) {
                if (sb.length() == 0 && numbs == 0){
                    continue;
                }
                sb.append(numbs);
            }

            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.multiply("123", "456"));

    }
}