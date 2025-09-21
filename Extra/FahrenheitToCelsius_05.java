package Extra;


import java.util.Scanner;

public class FahrenheitToCelsius_05 
{
	public static void main(String[] args) 
	{
		float temp = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit : ");
		
		float f = s.nextFloat();
		
		System.out.println("Temperature in celsius : "+fConvertC(f));

	}

	private static float fConvertC(float f) 
	{
		float temp;
		temp = ((f - 32)*5)/9;
		
		return temp;
	}

}

