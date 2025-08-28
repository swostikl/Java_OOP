package task6;

import task1.Book;

import java.util.ArrayList;

public class LibraryUsers {
        private ArrayList<Book> books = new ArrayList<>();
        private ArrayList<User> users = new ArrayList<>();

        public void Book(Book book) {
            books.add(book);
        }
        public void User( User user) {
           users.add(user);
        }



        public void addBook(Book book) {
            books.add(book);
        }

        public void addUser(User user) {
            users.add(user);
        }

        public void displayBooks() {
            if (books.isEmpty()) {
                System.out.println("No books available in the library.");
                return;
            }
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }

        public void displayUsers() {
            if (users.isEmpty()) {
                System.out.println("No registered users.");
                return;
            }
            System.out.println("Library Users:");
            for (User user : users) {
                System.out.println(user);
            }
        }

        // Borrow a book for a specific user
        public void borrowBook(User user, String title) {
            for (Book book : books) {
                if (book.getBookTitle().equalsIgnoreCase(title)) {
                    user.borrowBook(book);
                    books.remove(book);
                    System.out.println(user.getName() + " borrowed: " + book.getBookTitle());
                    return;
                }
            }
            System.out.println("Sorry, the book \"" + title + "\" is not available.");
        }

        // Return a book for a specific user
        public void returnBook(User user, Book book) {
            if (user.getBorrowedBooks().contains(book)) {
                user.returnBook(book);
                books.add(book);
                System.out.println(user.getName() + " returned: " + book.getBookTitle());
            } else {
                System.out.println(user.getName() + " does not have this book.");
            }
        }


}
