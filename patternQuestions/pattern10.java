/*
     ******
    ******
   ******
  ******
 ******
******
*/
package patternQuestions;

public class pattern10 {
	 public static void printPattern(int n)
	    {
	        int i, j;
	        // outer loop to handle number of rows
	        for (i = 1; i <= n; i++) {
	            // inner loop to print spaces
	            for (j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            // inner loop to print stars
	            for (j = 1; j <= n; j++) {
	                System.out.print("*");
	            }
	            // printing new line for each row
	            System.out.println();
	        }
	    }

	    // Driver Function
	    public static void main(String args[])
	    {
	        int n = 6;
	        printPattern(n);
	    }

}
