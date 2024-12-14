package String;

public class StringLength {
    public static void main(String[] args) {
        String input = "hello";
        int length = 0;
        for (char ch : input.toCharArray()) {
            length++;
        }
        System.out.println("length : " + length);
    }
}
