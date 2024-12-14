/*
1
12
1 3
1 4
1 5
1 4
1 3
12
1

*/
package patternQuestions;

public class pattern19 {
	  public static void printPattern(int n) {
	        // Generate the first half including the middle line
	        for (int i = 1; i <= n; i++) {
	        	if(i == 1){
	        		System.out.println("1");
	        	}else if (i == 2 ) {
	                System.out.println("1" + i);
	            } else {
	                System.out.println("1 " + i);
	            }
	        }

	        // Generate the second half excluding the middle line
	        for (int i = n - 1; i >= 1; i--) {
	        	if(i == 1){
	        		System.out.println("1");
	        	}else if (i == 2) {
	                System.out.println("1" + i);
	            } else {
	                System.out.println("1 " + i);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int n = 5;
	        printPattern(n);
	    }

}
