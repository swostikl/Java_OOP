package task1;


import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }
    public void displayBooks() {
        System.out.println("the details of all books in the library's collection, including their titles, authors, and publication years are:");
        for (Book book : books) {
            System.out.println("--------------------------------------------------------------------------------------------------------------");
            System.out.println("Book title : " + book.getBookTitle());
            System.out.println("Book author : " + book.getBookAuthor());
            System.out.println(" Book publication year : " + book.getPublicationYear());
        }
    }
    public ArrayList<Book> findBookByAuthor(String author) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getBookAuthor().equalsIgnoreCase(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }


}

