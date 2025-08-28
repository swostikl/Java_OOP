package task6;

import task1.Book;

import java.util.ArrayList;

public class User {
    // for task 5
    private String name;
    private int age;
    private ArrayList<Book> listOfBorrowedBooks;

    public  User( String name, int age){
        this.name = name;
        this.age = age;
        this.listOfBorrowedBooks = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public ArrayList<Book> getListOfBorrowedBooks(){
        return listOfBorrowedBooks;
    }

    public void borrowBook(Book book) {
        listOfBorrowedBooks.add(book);
    }
    public void returnBook(Book book) {
        listOfBorrowedBooks.remove(book);
    }

    @Override
    public String toString(){
        return "User: " + name + ", Age: " + age + " borrowed books: " + listOfBorrowedBooks.size();
    }

    public ArrayList<Book> getBorrowedBooks() {
        return  listOfBorrowedBooks;
    }
}
