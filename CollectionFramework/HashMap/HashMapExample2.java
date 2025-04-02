package HashMap;

import java.util.HashMap;

public class HashMapExample2 {

    public static void main(String[] args) {

        String text = "java is great and java is powerful";
        String[] words = text.split(" ");

        int count = 0;
        HashMap<String, Integer> wordCount = new HashMap<>();

        for(String word : words){
            count++;
        }

        System.out.println("Word Frequencies: " + count);
    }

}
