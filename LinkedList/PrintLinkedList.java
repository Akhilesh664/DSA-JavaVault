package LinkedList;

public class PrintLinkedList {

    //LinkedList Node
    static class Node{
        int data;   //stores data
        Node next;  //address of next node

        // Constructor to create a new node
        Node(int data){
            this.data= data;
        }
    }

    //printing linkedlist data through method
    static void display(Node head){
        Node temp2= head;
        while(temp2!=null){
            System.out.print(temp2.data + " ");
            temp2= temp2.next;
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

        //printing linkedlist through for loop
        Node temp= a;
        for(int i=1; i<=6; i++){
            System.out.print(temp.data + " ");
            temp= temp.next;
        }
        System.out.println();

        //printing linkedlist through while loop
        Node temp1= a;
        while(temp1 !=null){
            System.out.print(temp1.data+ " ");
            temp1= temp1.next;
        }
        System.out.println();

        //printing linkedlist data through method, which takes head node as argument
        display(a);
    }

}
