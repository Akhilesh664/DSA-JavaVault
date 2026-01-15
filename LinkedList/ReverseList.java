// Node class represents a single node of the linked list
class Node {
    int data;      // Data stored in the node
    Node next;     // Reference to the next node

    // Constructor to initialize node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Main class
public class ReverseList {

    // Method to reverse the linked list
    static Node reverse(Node head) {

        Node prev = null;   // Will become the new head
        Node curr = head;   // Start from the current head

        // Traverse the list
        while (curr != null) {

            Node nextTemp = curr.next; // Store next node
            curr.next = prev;          // Reverse the link
            prev = curr;               // Move prev forward
            curr = nextTemp;            // Move curr forward
        }

        // prev is the new head of reversed list
        return prev;
    }

    // Method to print the linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        // Create linked list: 1 -> 2 -> 3 -> 4 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original Linked List:");
        printList(head);

        // Reverse the linked list
        head = reverse(head);

        System.out.println("Reversed Linked List:");
        printList(head);
    }
}
