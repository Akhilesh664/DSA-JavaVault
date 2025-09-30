package Extra;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class ListIteratorExample_88 {
    public static void main(String[] args) {
        //Creating list of Books
        List<Book> list = new ArrayList<Book>();
        //Creating Books
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Java Program Questation", "Rajendra", "Technolamror", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        //Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        System.out.println("Original content of list is: ");
        //Traversing list
        for (Book b : list) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
        ListIterator<Book> itr = list.listIterator();
        System.out.println("Modified content of list in backward is: ");
        while (itr.hasNext()) {
            Book st = (Book) itr.next();
            System.out.println(st.quantity + " " + st.publisher + " " + st.author + " " + st.name + " " + st.id);
        }
    }
}
