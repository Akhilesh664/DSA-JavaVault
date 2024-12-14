package Extra;
import java.util.Scanner;

public class SwapNumbersWithout3rdVariable_07 
{
	
	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter 1st no. for swaping : ");
		int x = s.nextInt();
		
		System.out.println("Enter 2nd no. for swaping : ");
		int y = s.nextInt();
		
		System.out.println("Before swaping => x value : "+x+", y value : "+y);
		SwappingWithoutTemp(x, y);
	}

	private static void SwappingWithoutTemp(int x, int y) 
	{
		x = x + y;
		y = x - y;
		x = x - y;
			
		System.out.println("After swaping => x value : "+x+", y value : "+y);
	}
}
