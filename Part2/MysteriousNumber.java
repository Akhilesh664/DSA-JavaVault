package Part2;

import java.util.Scanner;

public class MysteriousNumber {
	public static void main(String[] args) 
	{
		System.out.println("Enter value for N : ");
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		System.out.println("Enter value for R : ");
		int R = s.nextInt();
		
		System.out.println(singleDigitNumber(N, R));
		
		s.close();
		
	}

	private static int singleDigitNumber(int N, int R) {
		
		//Sum of number
		int sum = 0;
		while(N != 0) {
			int temp = N%10;
			sum = sum+temp;
			N/=10;
		}
		
		// (sum ) R times
		int total = 0;
		while(R!=0) {
			total = total+sum;
			R--;
		}
		
		// add number for single number
		int grand = 0;
		while(total != 0) {
			int temp = total%10;
			grand = grand +temp;
			total/=10;
		}
	
		return grand;
		
		
	}

}
