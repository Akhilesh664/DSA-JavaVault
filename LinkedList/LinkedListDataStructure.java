package LinkedList;


class Linkedlist {
    Node head; // for head
    Node tail; // for tail

    // Add NewNode at Tail
    void addAtTail(int data){
        // Creation of new node
        Node newNode = new Node(data);

        // if head is null then temp will be head
        if(tail == null){
            tail = newNode;
            head = newNode;
            return;
        }

        // Traverse to last Node
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        // Attach new Node at end
        temp.next = newNode;
    }

    // Add NewNode at Head
//    void addAtHead(int data){
//
//        Node newNode = new Node(data);
//
//        newNode.next = head;
//
//
//    }

    // Display the list
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

}

public class LinkedListDataStructure {

    public static void main(String[] args) {

        Linkedlist list = new Linkedlist();
        list.addAtTail(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.addAtTail(40);
        list.addAtTail(50);

        list.display();
//        list.addAtHead(0);


    }
}
