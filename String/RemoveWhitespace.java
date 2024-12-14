package String;

public class RemoveWhitespace {
    public static void main(String[] args) {
        String input = "Java Programming Language";
        String result = input.replaceAll("\\s","");
        System.out.println("Without whitespaces : "+ result);
    }
}
