package RegexPractise;

public class TransposeMatrix_23 {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6},
                {7, 8, 9}};

        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

}
