package HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetWordCounter {
    public static void main(String[] args) {

        String sentence = "Java is awesome and Java is powerful";
        String[] words = sentence.split(" ");

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        System.out.println("Unique words: " + uniqueWords);
        System.out.println("Total unique words: " + uniqueWords.size());

    }
}
