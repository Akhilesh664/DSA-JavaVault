package Part1;

import java.util.Scanner;

public class MagicBoard 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		
		int[] number = new int[4];
		
		System.out.println("Enter the digits:");
		
		for(int i=0; i<4; i++) {
			number[i] = s.nextInt();
		}
		
		System.out.println("Sample Output:");
		
		for(int num : number) {
			char character = (char) num;
			System.out.println(num+"-"+character);
		}
		
		s.close();
		
		
	}

}
