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

    // This method is for task 3 for availability check so added this in same library and later will import this class in task 3

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getBookTitle().equalsIgnoreCase(title)) {
                return true; // if available
            }
        }
        return false; // if there is not
    }

    // This method used below is for task4
    // Calculating Average rate
    public double getAverageRating() {
        if (books.isEmpty()) {
            return 0;
        }
        double totalRating = 0;
        for (Book book : books) {
            totalRating += book.getRating();
        }
        return totalRating / books.size();
    }
    //Finding most reviewed book
    public Book getMostReviewedBook() {
        if (books.isEmpty()) {
            return null;
        }
        Book mostReviewed = books.getFirst();
        for (Book book : books) {
            if (book.getReviews().size() > mostReviewed.getReviews().size()) {
                mostReviewed = book; // update book if it has more reviews
            }
        }
        return mostReviewed;
    }

}

