package LeetCode;

import java.util.Arrays;

public class Q39 {

    static class Solution {

        public int[][] matrixReshape(int[][] original, int newRows, int newCols) {

            int oldRows = original.length;
            int oldCols = original[0].length;

            // total elements must remain the same
            if (oldRows * oldCols != newRows * newCols) {
                return original;
            }

            int[][] reshapedMatrix = new int[newRows][newCols];

            int position = 0;

            for (int i = 0; i < oldRows; i++) {
                for (int j = 0; j < oldCols; j++) {

                    int targetRow = position / newCols;
                    int targetCol = position % newCols;

                    reshapedMatrix[targetRow][targetCol] = original[i][j];
                    position++;
                }
            }

            return reshapedMatrix;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        int[][] reshaped = sol.matrixReshape(matrix, 1, 4);
        System.out.println(Arrays.deepToString(reshaped));


    }
}