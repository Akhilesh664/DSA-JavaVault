package Extra;
import java.util.Scanner;

public class ReverseNumber_20 
{
	public static void main(String[] args) 
	{
		int n, rev = 0;
		
		System.out.println("Enter the number to reverse : ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		while(n != 0) {
			int digit = n%10;
			rev = (rev*10)+digit;
			n = n/10;
		}
		System.out.println("reverse number is : "+rev);	
	}

}
