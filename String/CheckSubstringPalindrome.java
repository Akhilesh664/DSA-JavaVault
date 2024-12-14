package String;

public class CheckSubstringPalindrome {

    // Method to check if a string is a palindrome
    public static boolean checksubstringpalin(String str) {
        int i = 0;
        int j = str.length() - 1;

        // Two-pointer approach
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false; // Not a palindrome
            }
            i++;
            j--;
        }
        return true; // It is a palindrome
    }

    // Method to find and print all palindromic substrings
    public static void SubString(String str) {
        int n = str.length();

        // Iterate over starting indices
        for (int i = 0; i < n; i++) {
            // Iterate over ending indices
            for (int j = i; j < n; j++) {
                // Extract the substring starting at index i and ending at index j
                String subString = str.substring(i, j + 1);
                // Check if the substring is a palindrome
                if (checksubstringpalin(subString)) {
                    System.out.println(subString); // Print the substring
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "madam";
        SubString(str); // Call the method to find palindromic substrings
    }
}
