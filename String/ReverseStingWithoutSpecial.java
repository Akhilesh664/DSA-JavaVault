package String;

public class ReverseStingWithoutSpecial {

    public static void main(String[] args) {

        // Test reverseWithoutSpecial
        String reverseInput = "a,b$c";
        System.out.println("Reversed without special characters: " + reverseWithoutSpecial(reverseInput));
    }

    public static String reverseWithoutSpecial(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetterOrDigit(chars[left])) {
                left++;
            }
            else if (!Character.isLetterOrDigit(chars[right])) {
                right--;
            }
            else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}
