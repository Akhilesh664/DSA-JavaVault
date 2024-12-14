package Extra;
import java.util.Scanner;

public class RomanToInt 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the string for convertion : ");
		Scanner s = new Scanner(System.in);
		
		String str = s.next().toUpperCase();
		int result = convert(str);
		
		System.out.println("Integer representative : " + result);
	}

	public static int convert(String str) 
	{
		int sum = 0;
		int prevValue = 0;
		
		for(int i = str.length()-1; i>=0; i--) 
		{
			char romanChar = str.charAt(i);
			int currentValue = romanToValue(romanChar);
			
			 if (currentValue < prevValue) 
	            {
	                sum -= currentValue;
	            } else 
	            {
	                sum += currentValue;
	            }

	            prevValue = currentValue;
	        }

	        return sum;
		
		
	}

	 public static int romanToValue(char romanChar) 
	    {
	        switch (romanChar) 
	        {
	            case 'I':
	                return 1;
	            case 'V':
	                return 5;
	            case 'X':
	                return 10;
	            case 'L':
	                return 50;
	            case 'C':
	                return 100;
	            case 'D':
	                return 500;
	            case 'M':
	                return 1000;
	            default:
	                throw new IllegalArgumentException("Invalid Roman numeral character: " + romanChar);
	        }
	    }
}
