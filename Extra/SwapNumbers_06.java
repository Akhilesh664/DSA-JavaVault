// How to swap 2 no using 3rd variable Program in java 
package Extra;
import java.util.Scanner;

public class SwapNumbers_06 
{
	public static void main (String[] args) 
	{
	
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter 1st no. for swaping : ");
		int x = s.nextInt();
		
		System.out.println("Enter 2nd no. for swaping : ");
		int y = s.nextInt();
		
		
		System.out.println(" by value before swaping => x value : "+x+", y value : "+y);
		swaping(x,y);
		
	}

	private static void swaping(int x, int y) 
	{
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println(" after swaping => x value : "+x+", y value : "+y);
		
	}
	

}
