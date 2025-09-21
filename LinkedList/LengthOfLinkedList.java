//package LinkedList;
//
//public class LengthOfLinkedList {
//
//    // Node class for making second LinkedList
//    static class Node{
//        int data;
//        Node next;
//
//        Node(int data){
//            this.data = data;
//        }
//    }
//
//    // LinkedList class for making first LinkedList
//    static class LinkedList {
//
//        Node head = null;
//        Node tail = null;
//
//        void add(int val){
//            Node t = new Node(data);
//            if(head == null){
//                head = t;
//            }
//            else{
//                tail.next= t;
//            }
//        }
//
//
//    }
//
//
//
//    public static void main(String[] args) {
//
//        // creating first LinkedList using class by making instance
//        LinkedList l = new LinkedList();
//        l.add(1);
//        l.add(2);
//        l.add(3);
//        l.add(4);
//        l.add(5);
//
//        l.display();
//        l.findLength();
//
//        // creating second linkedList without using instance explicitly making it
//        node a = new Node(12);
//        node b = new Node(14);
//        node c = new Node(16);
//        node d = new Node(18);
//
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//
//        length(a);
//
//    }
//}
