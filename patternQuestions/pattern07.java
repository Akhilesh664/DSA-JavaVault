/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 

*/
package patternQuestions;

public class pattern07 {
	 public static void printPattern(int n)
	    {
	        int i,j,num = 1; 

	        // outer loop to handle number of rows
	        for (i = 1; i <= n; i++) {
	            // inner loop to handle number of columns
	            for (j = 1; j <= i; j++) {
	                // printing column values upto the row
	                // value.
	                System.out.print(num + " ");
	                num++;
	                
	            }

	            // print new line for each row
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
