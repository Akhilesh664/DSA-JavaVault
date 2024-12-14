package Extra;

import java.util.Scanner;

public class GetInputFromUser_04 
{
	public static void main(String[] args) 
	{
		int x;
		float y;
		String z;
		String a;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter x input in integer format : ");  // for integer
		x = s.nextInt();
		
		System.out.println("Enter y input in float format : ");	// for float
		y = s.nextFloat();
		
		System.out.println("Enter z input in string format : ");	// for string only before space or delimetter 
		z = s.next();
		
		System.out.println("Enter z1 input in StringLine format : "); 	// for string which print whole line with spaces
		a = s.nextLine();
		
		System.out.println("int input is : "+x);
		System.out.println("float input is : "+y);
		System.out.println("String input is : "+z);
		System.out.println("StringLine input is : "+a);
	}

}
