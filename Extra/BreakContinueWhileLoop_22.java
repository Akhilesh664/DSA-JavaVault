import java.util.Scanner;

public class BreakContinueWhileLoop_22 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the number : ");
			n = s.nextInt();
			if(n != 0) 
			{
				System.out.println("you entered : "+n);
				continue;
			}
			else {
				System.out.println("program stopped on : "+n);
				break;
			}
		}
	}
}
