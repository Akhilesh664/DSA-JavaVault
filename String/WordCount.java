package String;

public class WordCount {
    public static void main(String[] args) {
        String input = "hello world, welcome to java";
        String[] words = input.trim().split("\\s+");
        System.out.println("Number of words: " + words.length);

    }
}
