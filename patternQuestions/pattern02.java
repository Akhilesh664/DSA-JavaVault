/*
******
*****
****
***
**
*

*/
package patternQuestions;

public class pattern02 {
	
	 public static void printPattern(int n)
	    {
	        int i, j;

	        // outer loop to handle rows
	        for (i = n; i >= 1; i--) {

	            // inner loop to handle columns
	            for (j = 1; j <= i; j++) {
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
