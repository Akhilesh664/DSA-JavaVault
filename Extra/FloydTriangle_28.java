import java.util.Scanner;

public class FloydTriangle_28 
{
	public static void main(String[] args) 
	{
		int n, num = 1;
		System.out.print("Enter the Number of rows for floyd triangle : ");
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		
		System.out.println("Floyd's triangle :- ");
		
		for(int i = 1; i <= n; i++) 
		{
			for(int j = 1; j <= i; j++) 
			{
				System.out.print(num + " ");
				num++;
			}
			System.out.println(); 
		}	
	}
}
