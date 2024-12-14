
package Extra;

import java.util.Scanner;

public class Integers_02 
{
//	1st way.
//	public static void main(String[] args) 
//	{
//		int i;
//		
//		for(i=1; i<10; i++) 
//		{
//			System.out.println(i);
//		}
//	}
	
	
//	2nd way.	
	public static void main(String[] args) 
	{

		System.out.println("enter integer: ");
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		generrateInteger(x);	
	}
	
	private static void generrateInteger(int x) 
	{
		for(int i=1; i<=x; i++)
		{
			System.out.println(i);
		}
	}
}
