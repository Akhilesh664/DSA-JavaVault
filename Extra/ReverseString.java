package Extra;
import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String orignal, reverse = ""; 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string to reverse : ");
		orignal = s.nextLine();
		
		int length = orignal.length();
		for(int i=length-1; i>=0; i--) 
		{
			reverse = reverse + orignal.charAt(i);
		}
		System.out.println("Reverse of entered string is :\n"+reverse);
	
	
//	// or 2 way
//		StringBuffer a = new StringBuffer("java programming 2024");
//		
//		System.out.println("Orignal string : "+a);
//		System.out.println("Reversed String : "+a.reverse());
//		
	}
}

