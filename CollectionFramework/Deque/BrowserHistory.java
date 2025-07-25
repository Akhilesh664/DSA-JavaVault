package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    public static void main(String[] args) {

        Deque<String> history = new ArrayDeque<>();

        history.push("google.com");
        history.push("github2.com");
        history.push("amazon3.com");
        history.push("facebook4.com");
        history.push("instagram5.com");
        history.push("w3school6.com");
        history.push("1");

        System.out.println("current page: "+history.peek()); // added latest one

        history.pop(); // Go back
        history.pollLast(); // Go back remove last and return it

        System.out.println("After going back, current page: " + history.peek());
        System.out.println(history);

    }

}
