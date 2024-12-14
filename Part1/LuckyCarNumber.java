package Part1;

import java.util.Scanner;

public class LuckyCarNumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the car no: ");
		String input = s.nextLine();
				
		if(validNumber(input)) {
			int carNumber = Integer.parseInt(input);
			int sumOfDigit = sumOfDigits(carNumber);
			
			if(LuckyNumber(sumOfDigit)) {
				 System.out.println("Lucky Number");
            } 
			else{
                System.out.println("Sorry its not my lucky number");
            }
        } else{
            System.out.println(input + " is not a valid car number");
        }
		
		s.close();
	}

	
	private static boolean validNumber(String input) 
	{
		return input.matches("\\d{4}");
	}
	
	private static int sumOfDigits(int number) 
	{
		int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
	}
	
	private static boolean LuckyNumber(int sumOfDigit) {
		 return sumOfDigit % 3 == 0 || sumOfDigit % 5 == 0 || sumOfDigit % 7 == 0;
	}
	
}
