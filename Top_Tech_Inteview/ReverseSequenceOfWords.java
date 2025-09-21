package Top_Tech_Inteview;

public class ReverseSequenceOfWords {

    public static void main(String[] args) {

        String sentence = "Java is a programming language";

        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        // Add words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }
        System.out.println("Original: " + sentence);
        System.out.println("Reversed: " + reversed);

    }
}
