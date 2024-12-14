/* 
Enter value of n : 5
ABCDEEDCBA
ABCDDCBA
ABCCBA
ABBA
AA
*/
package patternQuestions;

import java.util.Scanner;

public class pattern16 {
	
	public static void pattern(int n){
		
        for (int i=1; i<=n; i++){
            char ch = 'A';
             for(int j=i; j<=n; j++){
                 System.out.print(ch);
                 ch++;
             }
             ch--;
             for(int j = i; j<=n; j++ ){
            	 System.out.print(ch);
            	 ch--;
             }
              System.out.println();
        }
    }

    
    public static void main(String[] args) {
        int n;
        System.out.println("Enter value of n : ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        pattern(n);
        
        s.close();
    }

}
