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
    // Show all books in the library
    public void displayAllBooks() {
        System.out.println("Books in the library:");
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }


    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println(book.getTitle() + " Book reserved successfully for " + member.getName());
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation canceled successfully for " + member.getName());
        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}
