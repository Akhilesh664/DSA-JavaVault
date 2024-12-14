package Extra;
import java.util.Scanner;

public class RomanToIntegerConversion 
{
    public int romanToInt(String s) {
        int sum = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char romanChar = s.charAt(i);
            int currentValue = romanToValue(romanChar);

            if (currentValue < prevValue) {
                sum -= currentValue;
            } else {
                sum += currentValue;
            }

            prevValue = currentValue;
        }

        return sum;
    }

    public int romanToValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Invalid Roman numeral character: " + romanChar);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the Roman number for conversion: ");
        Scanner s = new Scanner(System.in);

        String str = s.next().toUpperCase();
        RomanToIntegerConversion solution = new RomanToIntegerConversion();
        int result = solution.romanToInt(str);

        System.out.println("Integer representation: " + result);
    }
}


