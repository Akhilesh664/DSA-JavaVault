package LeetCode;

public class Q37 {
//    static class Solution {
//        public int countBattleships(char[][] board) {
//            int ships = 0;
//            int m = board.length;
//            int n = board[0].length;
//
//            for (int i = 0; i < m; i++) {
//
//                for (int j = 0; j < n; j++) {
//                    if (board[i][j] == 'X') {
//                        // check it is starting of ship
//                        boolean upEmpty = (i == 0 || board[i-1][j] != 'X'); // for upTesting
//                        boolean leftEmpty = (j == 0 || board[i][j-1] != 'X'); //for leftTesting
//
//                        if (leftEmpty && upEmpty) {
//                            ships++;
//                        }
//                    }
//                }
//            }
//
//            return ships;
//        }
//    }

    static class Solution {

        public int countBattleships(char[][] sea) {

            int rows = sea.length;
            int cols = sea[0].length;
            int count = 0;

            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {

                    if (sea[r][c] != 'X') {
                        continue;
                    }

                    count++;

                    // remove horizontal part of the ship
                    int tempC = c;
                    while (tempC < cols && sea[r][tempC] == 'X') {
                        sea[r][tempC] = '.';
                        tempC++;
                    }

                    // remove vertical part of the ship
                    int tempR = r + 1;
                    while (tempR < rows && sea[tempR][c] == 'X') {
                        sea[tempR][c] = '.';
                        tempR++;
                    }
                }
            }

            return count;
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();

        char[][] board1 = {
                {'X','.','.','X'},
                {'.','.','.','X'},
                {'.','.','.','X'}
        };
        System.out.println(s.countBattleships(board1));

    }
}