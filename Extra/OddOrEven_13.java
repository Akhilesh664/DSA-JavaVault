package Extra;

import java.util.Scanner;

public class OddOrEven_13 
{
	public static void main(String[] args) 
	{
		long x;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter value for check odd or even : ");
			x = s.nextLong();
		
			if(x%2 == 0) 
			{
				System.out.println("Number is even number");
			}else
			{
				System.out.println("Number is Odd number");
			}
		}
				
	}
}
