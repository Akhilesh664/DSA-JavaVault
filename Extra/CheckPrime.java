package Extra;

import java.util.Scanner;

public class CheckPrime 
{
	public static void main(String[] args) 
	{
		while(true) {
			System.out.print("Enter the number to CheckPrime : ");
			Scanner s = new Scanner(System.in);	
			int n = s.nextInt();
			
			System.out.println(isPrime(n) ? "yes it is prime" : "no it is not prime");
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
