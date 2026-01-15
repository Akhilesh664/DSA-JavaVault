package String;

// Given a string s, find the first non-repeating character and return its index. If there is no unique character, return -1.
// Input: s = "loveleetcode"
// Output: 2 // 'v' is the first non-repeating character
// by using frq array freq[256]

class freFirstNonRepeatingCharInString {
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
