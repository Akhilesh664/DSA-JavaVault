package HashTable;

import java.util.Hashtable;

public class HashTableExample2 {

    public static void main(String[] args) {

        String text = "hello world";
        Hashtable<Character, Integer> charFrequency = new Hashtable<>();

        for(char c : text.toCharArray()){
            if (c != ' '){
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Character Frequency: " + charFrequency);

    }

}
