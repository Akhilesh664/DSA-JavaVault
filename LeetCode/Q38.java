package LeetCode;

public class Q38 {

    static class Solution {

        public int islandPerimeter(int[][] terrain) {

            int height = terrain.length;
            int width = terrain[0].length;
            int boundaryLength = 0;

            for (int r = 0; r < height; r++) {
                for (int c = 0; c < width; c++) {

                    if (terrain[r][c] != 1) {
                        continue;
                    }

                    // check upper side
                    if (r == 0 || terrain[r - 1][c] == 0) {
                        boundaryLength++;
                    }

                    // check lower side
                    if (r == height - 1 || terrain[r + 1][c] == 0) {
                        boundaryLength++;
                    }

                    // check left side
                    if (c == 0 || terrain[r][c - 1] == 0) {
                        boundaryLength++;
                    }

                    // check right side
                    if (c == width - 1 || terrain[r][c + 1] == 0) {
                        boundaryLength++;
                    }
                }
            }

            return boundaryLength;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] grid1 = {
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}
        };
        System.out.println(sol.islandPerimeter(grid1));

    }
}