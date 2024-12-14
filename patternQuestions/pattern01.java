/*
enter n value : 
5
*
**
***
****
*****

*/
package patternQuestions;

import java.util.Scanner;

public class pattern01 {
	
	public static void main(String[] args) 
	{
		int n;
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter n value : ");
		n = s.nextInt();
		
		for(int i = 1; i<=n; i++) 
		{
			for(int j = 1; j<=i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
//		System.out.println("");
		s.close();	
	}
	

}
