package String;

public class StringPalindrome {
    public static void main(String[] args) {
        String input = "madam";
        String reversed = new StringBuilder(input).reverse().toString();

        String result = reversed.equals(input) ? "palindrome" : "not palindrome";
        System.out.println(result);
    }
}
