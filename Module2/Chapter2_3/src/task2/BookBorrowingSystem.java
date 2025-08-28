package task2;

import task1.Book;

public class BookBorrowingSystem {
    public static void main(String[] args) {
        LibraryEnhanced library =new LibraryEnhanced();

        Book Book1 = new Book("You Can Win", "Shiv Khera", 1998);
        Book Book2 = new Book("Muumilaakson", "Tove Jansson", 1957);
        Book book3 = new Book("Code: The Hidden language of Computer Hardware and Software ", "Charles Petzoid", 1999);
        Book book4 = new Book("JavaScript Absolute Beginner's Guide ", "Kirupa Chinnathambi", 2016);

        library.addBook(Book1);
        library.addBook(Book2);
        library.addBook(book3);
        library.addBook(book4);

        library.displayBooks();

        System.out.println("\n------ Book Borrowing------\n");
        Book borrowed = library.borrowBook("You Can Win");
        Book borrow =   library.borrowBook("Muumilaakson");


        System.out.println("\n------ Book returned------\n");
        library.returnBook(String.valueOf(borrow));
    }


}
