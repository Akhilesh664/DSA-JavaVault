package CollectionFramework.Deque;

import java.util.*;

public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        str = str.replaceAll("\\s+", "").toLowerCase();

        for (char c : str.toCharArray()) deque.offerLast(c);

        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "racecar";
        System.out.println(word + " is palindrome? " + isPalindrome(word));
    }

}
