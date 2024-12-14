/*
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

*/
package patternQuestions;

public class pattern17 {
	  public static void printPattern(int n)
	    {
	        int i, j;
	        int m = n-n/2;

	        // outer loop to handle upper part
	        for (i = 1; i <= m; i++) {
	            // inner loop to print stars
	            for (j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	        // outer loop to handle lower part
	        for (i = 1; i <= m-1; i++) {
	            // inner loop to print stars
	            for (j = 1; j <= m-i; j++) {
	                System.out.print("* ");
	            }

	            System.out.println();
	        }
	    }

	    // Driver Function
	    public static void main(String args[])
	    {
	        int n = 9;
	        printPattern(n);
	    }

}
