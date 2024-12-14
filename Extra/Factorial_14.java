import java.util.Scanner;

public class Factorial_14 
{
	public static void main(String[] args) {
		
		int n;
		
		System.out.println("enter n value for factorial no. : ");
		Scanner s = new Scanner (System.in);
		
		n = s.nextInt();
		
		Factorial_14 factorialCalc = new Factorial_14(); 
		factorialCalc.factorial( n );
		
	}

	private void factorial(int n) {
		
		int fact = 1;
		if(n < 0){
			System.out.println("Number should be non-negative.");
		}
		else{
			for(int c = 1; c <= n; c++) {
				fact = fact * c;
			}
			System.out.println("Factorial of "+ n +" is = " + fact);
		}
	}
}
