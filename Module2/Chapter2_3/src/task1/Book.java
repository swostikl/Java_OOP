package task1;

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private int publicationYear;

    public Book(String bookTitle, String bookAuthor, int publicationYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.publicationYear = publicationYear;
    }
    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    @Override
    public String toString() {
        return "Book title: " + getBookTitle() +
                ", Author: " + getBookAuthor() +
                ", Year: " + getPublicationYear();
    }

}
