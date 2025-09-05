package model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private int MemberId;
    private List<Book> reservedBooks;

    public LibraryMember(String name, int MemberId){
        this.name = name;
        this.MemberId = MemberId;
        this.reservedBooks = new ArrayList<>();
    }

    //getters
    public String getName(){
        return name;
    }
    public int getMemberId(){
        return MemberId;
    }
    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }

    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }

    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }

    public List<Book> getReservedBooks() {
        return reservedBooks;
    }

}
