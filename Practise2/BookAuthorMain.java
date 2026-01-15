// 3rd cdac java assignment 2

package Practise2;

public class BookAuthorMain {

    public static void main(String[] args) {
        var aut1 = new Author("jk rollings", "jkroll@gmail.com0", 'F');

        var book1 = new Book("the secreat", aut1, 350, 2 );
        System.out.println(book1);

        aut1.setEmail("anil@gmail.com");
        book1.setPrice(500);
        System.out.println(book1);

    }
}
