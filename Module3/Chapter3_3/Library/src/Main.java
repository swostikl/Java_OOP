import model.Book;
import model.LibraryMember;
import system.Library;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Create some books
        Book book1 = new Book("1984", "George Orwell", 123456);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 654321);

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Create some members
        LibraryMember member1 = new LibraryMember("Alice", 1);
        LibraryMember member2 = new LibraryMember("Bob", 2);

        // Register members
        library.registerMember(member1);
        library.registerMember(member2);

        // Member borrows a book
        library.borrowBook(member1, book1);

        // Member returns a book
        library.returnBook(member1, book1);
    }
}