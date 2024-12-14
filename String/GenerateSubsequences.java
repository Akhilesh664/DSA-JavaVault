package String;

public class GenerateSubsequences {
    public static void main(String[] args) {
        String str = "abcd";
        int n = str.length();

        // Iterate over starting indices
        for (int i = 0; i < n; i++) {
            // Iterate over ending indices
            for (int j = i; j < n; j++) {
                // Extract the substring starting at index i and ending at index j
                String subString = str.substring(i, j + 1); // substring() method in Java
                System.out.println(subString); // Print the substring
            }
            System.out.println(); // Print a newline after each set of substrings starting from index i
        }
    }
}
