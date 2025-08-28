package task2;

import task1.Book;

import java.util.ArrayList;
import java.lang.String;

public class LibraryEnhanced {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("All books in the library collection are :");
        for (Book book : books) {
            System.out.println("Book title : " + book.getBookTitle());
            System.out.println("Book author : " + book.getBookAuthor());
            System.out.println(" Book publication year : " + book.getPublicationYear());
        }
    }

    public ArrayList<Book> findBooksByAuthor(String author) {
        ArrayList<Book> findBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getBookAuthor().equals(author)) {
                findBooks.add(book);
            }
        }
        return findBooks;
    }

    // Borrow a book by title
    public Book borrowBook(String bookTitle) {
        for (Book book : books) {
            if (book.getBookTitle().equalsIgnoreCase(bookTitle)) {
                books.remove(book);
                System.out.println("You Borrowed : " + bookTitle + " book from the library");
                return book; //return borrowed book
            }

        }
        System.out.println(" Sorry there is not available this book !!!! " + bookTitle);
        return null;
    }

    // Returning book
    public void returnBook(String bookTitle) {
        for (Book book : books) {
            if (book != null) {
                books.add(book);
                System.out.println("You Returned : " + bookTitle + " book from the library");
            }
        }
    }
}


