package Extra;

import java.util.Scanner;

public class AddNumbers_08 
{
	
	public static void main(String[] args) {
		
	int x, y, z;
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter x, y value : ");
	x = s.nextInt();
	y = s.nextInt();
	
	z = x + y;
	
	System.out.println("Addition of "+x+", "+y+" is "+ z);

	}
}
