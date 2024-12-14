package Part3;

public class Book {
	String title;
	
    Author author; // taking object

    Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    void displayDetails() {
        System.out.println("Book Title: " + title);
        author.displayDetails();
    }
    
    

}
