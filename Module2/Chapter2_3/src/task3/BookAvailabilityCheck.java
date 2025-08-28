package task3;

import task1.Book;
import task1.Library;

public class BookAvailabilityCheck {
    public static void main(String[] args)
    {
        Library library = new Library();

        Book Book1 = new Book("You Can Win", "Shiv Khera", 1998);
        Book Book2 = new Book("Muumilaakson", "Tove Jansson", 1957);
        Book book3 = new Book("Code: The Hidden language of Computer Hardware and Software ", "Charles Petzoid", 1999);
        Book book4 = new Book("JavaScript Absolute Beginner's Guide ", "Kirupa Chinnathambi", 2016);

        library.addBook(Book1);
        library.addBook(Book2);
        library.addBook(book3);
        library.addBook(book4);

        library.displayBooks();

        //check the availability of a book
        System.out.println( " \n Is there book named  You Can Win ? " + library.isBookAvailable("You Can Win") );
        System.out.println("\n Is there book named Computer Science ? " + library.isBookAvailable(" Computer Science")); // this book is not here just checking

    }
}
