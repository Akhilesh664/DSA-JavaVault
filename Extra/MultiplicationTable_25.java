package Extra;
import java.util.Scanner;

public class MultiplicationTable_25 
{
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter integer for table : ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for( int i = 1; i<=10; i++) {
			System.out.println(n + " X " + i + " = " + (n*i));
		}
		s.close();
	}
}
