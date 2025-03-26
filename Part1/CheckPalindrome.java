package Part1;
import java.util.Scanner;
public class  CheckPalindrome
{
	public static void main(String[] args) 
	{
		System.out.println("Enter value for check palindrome : ");
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		if(n < 0) {
			System.out.println("Not Palindrome");	
		}
		else 
		{
		palindromeOrNot(n);
		}
	}

	private static void palindromeOrNot(int n) 
	{
		int rev = 0;
		int org = n;
		while(n != 0) 
		{
			int temp = n%10;
			rev = rev*10 + temp;
			n/=10;
		}
		System.out.println(rev == org? "Yes Palindrome": "Not Palindrome");		
	}

}
