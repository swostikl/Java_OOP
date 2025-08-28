package task1;

import java.util.ArrayList;

public class LibraryMain {
    public static void main(String[] args) {
        // Creating books instance

        Book Book1 = new Book("You Can Win", "Shiv Khera", 1998);
        Book Book2 = new Book("Muumilaakson", "Tove Jansson", 1957);
        Book book3 = new Book("Code: The Hidden language of Computer Hardware and Software ", "Charles Petzoid", 1999);
        Book book4 = new Book("JavaScript Absolute Beginner's Guide ", "Kirupa Chinnathambi", 2016);

        // Creating library

        Library library = new Library();

        // Adding books to library
        library.addBook(Book1);
        library.addBook(Book2);
        library.addBook(book3);
        library.addBook(book4);

        // Display all books
        library.displayBooks();

        // Search book by author name Shiv khera

        String findAuthor = "Shiv Khera";
        ArrayList<Book> kheraBook = library.findBookByAuthor(findAuthor);
        System.out.println("\nBooks by " + findAuthor + ":");
        for (Book book : kheraBook) {
            System.out.println(book);
        }

    }
}
