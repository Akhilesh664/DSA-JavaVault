package Part3;

public class Author {

    String name;
    String email;

    Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    void displayDetails() {
        System.out.println("Author Name: " + name + ", Email: " + email);
    }

    
    public static void main(String[] args) {
    	Author author = new Author("J.K. Rowling", "jk@rowling.com");
    	Book book = new Book("Harry Potter", author); // sending author object in book class
        book.displayDetails();
	}
}
