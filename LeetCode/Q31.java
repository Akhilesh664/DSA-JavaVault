package LeetCode;

import java.util.Scanner;

public class Q31 {

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int NoOfTests = sc.nextInt();  // num of test case
        sc.nextLine();

        for (int t = 0; t < NoOfTests; t++) {
            String str1 = sc.nextLine();

            int result = 0;
            int idx = 0;

            while (idx < str1.length() - 1) {
                // if Adjacent character are not same, count removal
                if (str1.charAt(idx) != str1.charAt(idx + 1)) {
                    result++;
                    idx += 2;  // skip the pair
                } else {
                    idx++;  // move to next char
                }
            }

            System.out.println(result);
        }

        sc.close();  // close scanner
    }
}
