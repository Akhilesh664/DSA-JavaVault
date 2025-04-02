package LinkedList;

// 💡 LinkedList is a doubly linked list implementation that provides efficient insertions and deletions (O(1) at head/tail), but slower random access (O(n)).

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.reverse(ll);
        System.out.println("Reversed LinkedList: "+ll);
    }
}
