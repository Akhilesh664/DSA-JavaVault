import java.util.Scanner;

public class CheckPalindrome 
{
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long reversed = 0;
        long temp = x;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return (reversed == x);
    }
    
    public static void main(String[] args) 
    {
		System.out.println("enter number for check palindrome : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println(isPalindrome(n) ? "true" : "false");
	}
}
