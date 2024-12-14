package Extra;
import java.util.Scanner;

public class NPrimeNumber_26 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number upto you want prime number : ");
		Scanner s = new Scanner(System.in);	
		int n = s.nextInt();
		
		if(n >= 1) {
			System.out.println("First "+ n +" prime numbers are : ");
			generatePrime(n);
		}
	
	}

	private static void generatePrime(int n) 
	{
		int count = 0;
		for (int num = 2; count < n; num++) {
			if(isPrime(num)) {
				System.out.println(num);
				count++;
			}
		}
	}
	
	public static boolean isPrime(int n) 
	{
		if(n <= 1) 
		{
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
