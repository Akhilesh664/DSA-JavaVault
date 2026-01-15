package CollectionFramework.HashMap;

import java.util.HashMap;

public class HashMapExample2 {

    public static void main(String[] args) {

        String text = "java is great and java is powerful";
        String[] words = text.split(" ");


        // Using HashMap
//        HashMap<String, Integer> wordCount = new HashMap<>(); // Or Use HashMap
//        for (String word : words) {
//            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
//        }
//        System.out.println("Word Frequencies: " + wordCount);


        // Using for loop
        int count = 0;
        for(String word : words){
            count++;
        }
        System.out.println("Word Frequencies: " + count);

    }

}
