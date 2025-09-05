package model;

public class Book {
    private String title;
    private String author;
    private int ISBN;

    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    //getters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getISBN() {
        return ISBN;
    }
}
