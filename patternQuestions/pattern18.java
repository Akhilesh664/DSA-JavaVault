/*
Enter number of levels of the pattern: 5
    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 

*/
package patternQuestions;

import java.util.Scanner;

public class pattern18 {

    public static void generatePascalsTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            int coef = 1;
            for (int k = n - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(coef + " ");
                coef = coef * (i - j) / j;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of levels of the pattern: ");
        int num = scanner.nextInt();
        generatePascalsTriangle(num);

        scanner.close();
    }

}
