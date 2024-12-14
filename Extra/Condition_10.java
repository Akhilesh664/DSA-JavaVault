import java.util.Scanner;

public class Condition_10 
{
	public static void main(String[] args) 
	{
		boolean learning;
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter true or false, is he is learning?");
		
		learning = s.nextBoolean();
		
		if(learning) 
		{
			System.out.println("java programmer");
		}
		else
		{
			System.out.println("what are you doing here?");
		}	
	}
}
