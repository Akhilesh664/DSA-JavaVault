package Extra;

import java.util.Scanner;

public class LargestOfThreeNumbers_09 
{
	public static void main(String[] args) 
	{
		int x,y,z;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter x value : ");
		x = s.nextInt();
		
		System.out.println("Enter y value : ");
		y = s.nextInt();
		
		System.out.println("Enter z value : ");
		z = s.nextInt();
		
		FindingLargest(x,y,z);
		
	}

	private static void FindingLargest(int x, int y, int z) 
	{
//		if(x>y && x>z)
//		{
//			System.out.println(x+" : x largest then y,z");
//		}
//		else if(y>x && y>z)
//		{
//			System.out.println(y+" : y largest then x,z");
//		}else if(z>x && z>y)
//		{
//			System.out.println(z+" : z largest then x,y");
//		}else
//		{
//			System.out.println("Entered numbers are not distinct");
//		}

		// or
		System.out.println(Math.max(x, Math.max(y, z)));
	}
	
}
