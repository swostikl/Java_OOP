package task6;

import task1.Book;

public class Main {
    public static void main(String[] args) {
        LibraryUsers library = new LibraryUsers();

        // Create books
        Book Book1 = new Book("You Can Win", "Shiv Khera", 1998);
        Book Book2 = new Book("Muumilaakson", "Tove Jansson", 1957);
        Book book3 = new Book("Code: The Hidden language of Computer Hardware and Software ", "Charles Petzoid", 1999);
        Book book4 = new Book("JavaScript Absolute Beginner's Guide ", "Kirupa Chinnathambi", 2016);

        // Adding books to library
        library.addBook(Book1);
        library.addBook(Book2);
        library.addBook(book3);
        library.addBook(book4);

        // Create users
        User u1 = new User("Alice", 25);
        User u2 = new User("Bob", 30);

        // Register users
        library.addUser(u1);
        library.addUser(u2);

        // Display library contents
        library.displayBooks();
        System.out.println("\n-------------------------------------");

        library.displayUsers();
        System.out.println("\n--------------------------------------");

        // Borrow & return
        library.borrowBook(u1, "You Can Win");
        library.borrowBook(u2, "Muumilaakson");

        System.out.println("\n--------------------------------------");

        System.out.println("\nAfter borrowing:");
        library.displayBooks();
        System.out.println("\n--------------------------------------");


        library.displayUsers();
        System.out.println("\n--------------------------------------");


        library.returnBook(u1, Book1);

        System.out.println("\n--------------------------------------");

        System.out.println("\nAfter returning:");
        library.displayBooks();
        library.displayUsers();
    }
}
