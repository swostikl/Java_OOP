import model.Book;
import model.LibraryMember;
import system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Create some books
        Book book1 = new Book("You can win", "ABC", 1234);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 5678);
        Book book3 = new Book("Computer Science", "Rakesh" ,2468);
        Book book4 = new Book("Poor Daddy Rich Daddy","XXX" , 3579);

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // display books in library
        library.displayAllBooks();
        System.out.println("-------------------");


        // Create some members
        LibraryMember member1 = new LibraryMember("Alice", 1);
        LibraryMember member2 = new LibraryMember("Bob", 2);
        LibraryMember member3 = new LibraryMember("Swosti", 3);
        LibraryMember member4 = new LibraryMember("Raj",4);

        // Register members
        library.registerMember(member1);
        library.registerMember(member2);
        library.registerMember(member3);
        library.registerMember(member4);

        // reserved Books and display books
        library.reserveBook(member3, book2);
        library.reserveBook(member2 , book3);
        library.displayReservedBooks(member3);
        library.displayReservedBooks(member2);
        System.out.println("-------------------");


        // Cancelled reserved books and display

        library.cancelReservation(member2, book3);
        library.displayReservedBooks(member2);
        System.out.println("-------------------");



        // Member borrows a book
        library.borrowBook(member1, book1);

        // Member returns a book
        library.returnBook(member1, book1);
    }
}