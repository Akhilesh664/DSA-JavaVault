package LinkedList;


//LinkedList Node1
class Node1{
    int data;   //stores data
    Node1 next;  //address of next Node1

    // Constructor to create a new Node1
    Node1(int data){
        this.data= data;
    }

    // printing values / Traverse
    public static void display(Node1 head){
        Node1 temp = head;
            while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("------------");
    }

    public static void displayRec(Node1 head){
        if(head == null){
            return;
        }
        System.out.println(head.data);
        displayRec(head.next);

    }

    public static int getElement(Node1 head, int index){
        Node1 temp = head;
        for(int i = 1; i <= index; i++){
            temp = temp.next;
        }
        return temp.data;
    }
}

public class CreateLinkedList {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        Node1 a = new Node1(1); // Head Node1
        Node1 b = new Node1(2);
        Node1 c = new Node1(3);
        Node1 d = new Node1(4);
        Node1 e = new Node1(5);

        // connecting Node1 to other
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null; // opptional

        System.out.println(a); // print a means its refrence address
        System.out.println(b); // print a means its refrence address
        System.out.println(c); // print a means its refrence address
        System.out.println(d); // print a means its refrence address


        System.out.println("--------------");


        // option for traverse [NOT recommended]
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);

        System.out.println("--------------");

        Node1.display(a);
        Node1.displayRec(a);
        System.out.println("--------------");
        Node1 head = a;
        int index = 3;
        System.out.println("Element at "+ index + " is " +Node1.getElement(head, index));

    }

}
