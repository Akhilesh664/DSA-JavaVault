import java.util.Scanner;

public class BreakWhileLoop_21 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the number : ");
			n = s.nextInt();
			if(n == 0) 
			{
				System.out.println("program got stopped on : "+n);
				break;
			}
		System.out.println("input number is : "+n);
		}
	}
	
}
