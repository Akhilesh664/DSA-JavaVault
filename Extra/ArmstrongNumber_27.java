import java.util.Scanner;
import java.util.* ;

public class ArmstrongNumber_27 
{
	public static void main(String[] args) 
	{
		int n;
		System.out.println("enter number for check armstrong Number : ");
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		System.out.println(isArmstrongNumber(n) ? " Yes it is Armstrong Number " : " No it is not Armstrong Number ");
		
	}

	private static boolean isArmstrongNumber(int n) 
	{
		int orignalNumber; 
		double remainder; 
		double result = 0;
		double nDigits = 0;
		
		orignalNumber = n;
		
		// count number of digit in input number 
		while(orignalNumber != 0) 
		{
			nDigits++;
			orignalNumber = orignalNumber/10; 
		}
		
		orignalNumber = n;
		
		// calculate the Armstrong number
		while(orignalNumber != 0) 
		{
			remainder = orignalNumber % 10;
			result = result + Math.pow(remainder, nDigits);
			orignalNumber = orignalNumber/10;
		}
		
		return result == n;
		
	}
	
	
}
