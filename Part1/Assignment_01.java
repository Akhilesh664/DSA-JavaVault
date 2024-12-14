package Part1;
import java.util.Scanner;

public class Assignment_01 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Call each function to execute the tasks
	        getVoterId(scanner);
	        checkNumberGreaterThanTen(scanner);
	        compareTwoNumbers(scanner);
	        findMaxOfThreeNumbers(scanner);
	        findMaxOfFiveNumbers(scanner);
	        checkNumberSign(scanner);
	        checkVowelOrConsonant(scanner);
	        checkDivisibilityByFiveAndEleven(scanner);
	        checkCharacterCase(scanner);
	        checkDivisibilityBySevenOrThree(scanner);
	        swapNumbers(scanner);
	        identifyGender(scanner);
	        getDayOfWeek(scanner);
	        checkEvenOrOdd(scanner);
	        characterMatch(scanner);

	        scanner.close();
	    }

	    // 1) Voter ID
	    private static void getVoterId(Scanner scanner) {
	        System.out.println("Enter your Voter ID:");
	        String voterId = scanner.nextLine();
	        System.out.println("Your Voter ID is: " + voterId);
	    }

	    // 2) One number max a > 10
	    private static void checkNumberGreaterThanTen(Scanner scanner) {
	        System.out.println("Enter a number:");
	        int a = scanner.nextInt();
	        if (a > 10) {
	            System.out.println("The number is greater than 10");
	        } else {
	            System.out.println("The number is not greater than 10");
	        }
	    }

	    // 3) Two numbers max a, b
	    private static void compareTwoNumbers(Scanner scanner) {
	        System.out.println("Enter two numbers:");
	        int a = scanner.nextInt();
	        int b = scanner.nextInt();
	        if (a > b) {
	            System.out.println("The greater number is: " + a);
	        } else if (b > a) {
	            System.out.println("The greater number is: " + b);
	        } else {
	            System.out.println("Both numbers are equal");
	        }
	    }

	    // 4) Three numbers max a, b, c
	    private static void findMaxOfThreeNumbers(Scanner scanner) {
	        System.out.println("Enter three numbers:");
	        int a = scanner.nextInt();
	        int b = scanner.nextInt();
	        int c = scanner.nextInt();
	        if (a >= b && a >= c) {
	            System.out.println("The greatest number is: " + a);
	        } else if (b >= a && b >= c) {
	            System.out.println("The greatest number is: " + b);
	        } else {
	            System.out.println("The greatest number is: " + c);
	        }
	    }

	    // 5) Five numbers max a, b, c, d, e
	    private static void findMaxOfFiveNumbers(Scanner scanner) {
	        System.out.println("Enter five numbers:");
	        int a = scanner.nextInt();
	        int b = scanner.nextInt();
	        int c = scanner.nextInt();
	        int d = scanner.nextInt();
	        int e = scanner.nextInt();
	        int max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
	        System.out.println("The greatest number is: " + max);
	    }

	    // 6) Check if the number is positive, negative, or zero
	    private static void checkNumberSign(Scanner scanner) {
	        System.out.println("Enter a number to check if it's positive, negative, or zero:");
	        int number = scanner.nextInt();
	        if (number > 0) {
	            System.out.println("The number is positive.");
	        } else if (number < 0) {
	            System.out.println("The number is negative.");
	        } else {
	            System.out.println("The number is zero.");
	        }
	    }

	    // 7) Vowel and consonant
	    private static void checkVowelOrConsonant(Scanner scanner) {
	        System.out.println("Enter a character:");
	        char ch = scanner.next().charAt(0);
	        if (isVowel(ch)) {
	            System.out.println(ch + " is a vowel.");
	        } else if (Character.isAlphabetic(ch)) {
	            System.out.println(ch + " is a consonant.");
	        } else {
	            System.out.println(ch + " is not an alphabetic character.");
	        }
	    }

	    // 8) Divisible by 5 and 11
	    private static void checkDivisibilityByFiveAndEleven(Scanner scanner) {
	        System.out.println("Enter a number to check divisibility by 5 and 11:");
	        int num = scanner.nextInt();
	        if (num % 5 == 0 && num % 11 == 0) {
	            System.out.println("The number is divisible by both 5 and 11.");
	        } else if (num % 5 == 0 || num % 11 == 0) {
	            System.out.println("The number is divisible by either 5 or 11.");
	        } else {
	            System.out.println("The number is not divisible by either 5 or 11.");
	        }
	    }

	    // 9) Upper case and lower case input
	    private static void checkCharacterCase(Scanner scanner) {
	        System.out.println("Enter a character to check its case:");
	        char caseChar = scanner.next().charAt(0);
	        if (Character.isUpperCase(caseChar)) {
	            System.out.println("The character is uppercase.");
	        } else if (Character.isLowerCase(caseChar)) {
	            System.out.println("The character is lowercase.");
	        } else {
	            System.out.println("The character is not a letter.");
	        }
	    }

	    // 10) Check if the integer is divisible by 7 or 3
	    private static void checkDivisibilityBySevenOrThree(Scanner scanner) {
	        System.out.println("Enter an integer to check divisibility by 7 or 3:");
	        int divisibleNum = scanner.nextInt();
	        if (divisibleNum % 7 == 0) {
	            System.out.println("The number is divisible by 7.");
	        } else if (divisibleNum % 3 == 0) {
	            System.out.println("The number is divisible by 3.");
	        } else {
	            System.out.println("The number is not divisible by 7 or 3.");
	        }
	    }

	    // 11) Number swap (two ways)
	    private static void swapNumbers(Scanner scanner) {
	        System.out.println("Enter two numbers to swap:");
	        int firstNumber = scanner.nextInt();
	        int secondNumber = scanner.nextInt();
	        // First way
	        int temp = firstNumber;
	        firstNumber = secondNumber;
	        secondNumber = temp;
	        System.out.println("After swap (method 1): firstNumber = " + firstNumber + ", secondNumber = " + secondNumber);

	        // Second way (without a temp variable)
	        System.out.println("Enter two numbers to swap (method 2):");
	        firstNumber = scanner.nextInt();
	        secondNumber = scanner.nextInt();
	        firstNumber = firstNumber + secondNumber;
	        secondNumber = firstNumber - secondNumber;
	        firstNumber = firstNumber - secondNumber;
	        System.out.println("After swap (method 2): firstNumber = " + firstNumber + ", secondNumber = " + secondNumber);
	    }

	    // 12) Gender based on character
	    private static void identifyGender(Scanner scanner) {
	        System.out.println("Enter your gender (m for male, f for female, o for other):");
	        char gender = scanner.next().charAt(0);
	        switch (gender) {
	            case 'm':
	                System.out.println("You are male.");
	                break;
	            case 'f':
	                System.out.println("You are female.");
	                break;
	            case 'o':
	                System.out.println("You are other.");
	                break;
	            default:
	                System.out.println("Invalid input.");
	        }
	    }

	    // 13) Number to week days
	    private static void getDayOfWeek(Scanner scanner) {
	        System.out.println("Enter a number (1-7) to get the day of the week:");
	        int dayNumber = scanner.nextInt();
	        switch (dayNumber) {
	            case 1:
	                System.out.println("Sunday");
	                break;
	            case 2:
	                System.out.println("Monday");
	                break;
	            case 3:
	                System.out.println("Tuesday");
	                break;
	            case 4:
	                System.out.println("Wednesday");
	                break;
	            case 5:
	                System.out.println("Thursday");
	                break;
	            case 6:
	                System.out.println("Friday");
	                break;
	            case 7:
	                System.out.println("Saturday");
	                break;
	            default:
	                System.out.println("Invalid day number.");
	        }
	    }

	    // 14) Check even or odd
	    private static void checkEvenOrOdd(Scanner scanner) {
	        System.out.println("Enter a number to check if it's even or odd:");
	        int checkNum = scanner.nextInt();
	        if (checkNum % 2 == 0) {
	            System.out.println("The number is even.");
	        } else {
	            System.out.println("The number is odd.");
	        }
	    }

	    // 15) Character match
	    private static void characterMatch(Scanner scanner) {
	        System.out.println("Enter a character to get its match:");
	        char matchChar = scanner.next().charAt(0);
	        switch (matchChar) {
	            case 'a':
	                System.out.println("a => apple");
	                break;
	            case 'b':
	                System.out.println("b => ball");
	                break;
	            case 'c':
	                System.out.println("c => cat");
	                break;
	            default:
	                System.out.println("Character not matched.");
	        }
	    }

	    // Function to check if a character is a vowel
	    private static boolean isVowel(char ch) {
	        return "AEIOUaeiou".indexOf(ch) != -1;
	    }

	


}
