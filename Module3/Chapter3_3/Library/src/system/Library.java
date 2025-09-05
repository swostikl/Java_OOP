package system;

import model.Book;
import model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<LibraryMember> members;

    public Library(){
        books = new ArrayList<>();
        members = new ArrayList<>();
    }
    // methods to add books
    public void addBook(Book book){
        books.add(book);
    }
    // method to add members
    public void registerMember(LibraryMember member) {
        members.add(member);
    }
    //borrow book
    public void borrowBook(LibraryMember member, Book book) {
        if (books.contains(book) && members.contains(member)) {
            books.remove(book);
            // In a complete implementation, we would also add the book to the member's borrowed list
            System.out.println(member.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println("Either the book is not available or the member is not registered.");
        }
    }
    // return book
    public void returnBook(LibraryMember member, Book book) {
        if (members.contains(member)) {
            books.add(book);
            // In a complete implementation, we would also remove the book from the member's borrowed list
            System.out.println(member.getName() + " returned " + book.getTitle());
        } else {
            System.out.println("The member is not registered.");
        }
    }
}







