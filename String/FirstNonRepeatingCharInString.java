package String;

public class FirstNonRepeatingCharInString {
    public static void main(String[] args) {
        // Test firstNonRepeatingChar
        String nonRepeatingInput = "swiss";
        System.out.println("First non-repeating character in '" + nonRepeatingInput + "': " + firstNonRepeatingChar(nonRepeatingInput));

    }

    public static char firstNonRepeatingChar(String str) {
        int[] freq = new int[256]; // ASCII size by default array initialised by 0 so it get increase by 1 when ch again comes
        for (char ch : str.toCharArray()){
            freq[ch]++;
        }
        // return first ch value by traversing freq array
        for (char ch : str.toCharArray()) {
            if (freq[ch] == 1) {
                return ch;
            }
        }
        return '\0'; // No unique character
    }
}
