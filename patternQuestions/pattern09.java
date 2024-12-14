/*
Enter value for pattern : 5
    1
   212
  32123
 4321234
543212345

*/
package patternQuestions;

import java.util.Scanner;

public class pattern09 {
	 public static void main(String[] args) {
		 
		System.out.println("Enter value for pattern : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            // for space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // for decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            
            // for increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            
            // move to the next line
            System.out.println();
        }
        
        scanner.close();
    }

}
