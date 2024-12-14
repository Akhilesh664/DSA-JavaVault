import java.math.BigInteger;
import java.util.Scanner;

public class AddinglargeNumbers_08 
{
	public static void main(String[] args) 
	{
		String num1, num2;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter num1 value : ");
		num1 = s.nextLine();
		
		System.out.println("Enter num2 value : ");
		num2 = s.nextLine();
		
		BigInteger first = new BigInteger(num1);
		BigInteger Second = new BigInteger(num2);
		
		BigInteger sum = first.add(Second);
		
		System.out.println("the big Integer sum is equals to : "+sum);
		
		
	}
	
	
}
