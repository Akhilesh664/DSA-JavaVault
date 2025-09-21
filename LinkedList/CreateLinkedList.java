package LinkedList;

public class CreateLinkedList {

    //LinkedList Node
    static class Node{
        int data;   //stores data
        Node next;  //address of next node

        // Constructor to create a new node
        Node(int data){
            this.data= data;
        }
    }

    public static void main(String[] args) {

        // creating new nodes
        Node a= new Node(1);
        Node b= new Node(2);
        Node c= new Node(3);
        Node d= new Node(4);
        Node e= new Node(5);
        Node f= new Node(6);

        // implementing linkedlist by connecting nodes through address
        a.next= b;
        b.next= c;
        c.next= d;
        d.next= e;
        e.next= f;
        f.next= null;

        //printing data of each node of the linkedlist
        System.out.println(a.data + " " + b.data + " " + c.data + " " + d.data + " " + e.data + " " + f.data);

        Node temp = a;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}
