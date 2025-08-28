package task5;

import task1.Book;
import task1.Library;

public class LibraryStatistics {
    public static void main(String[] args) {
        Library library = new Library();

        Book Book1 = new Book("You Can Win", "Shiv Khera", 1998);
        Book Book2 = new Book("Muumilaakson", "Tove Jansson", 1957);
        Book book3 = new Book("Code: The Hidden language of Computer Hardware and Software ", "Charles Petzoid", 1999);
        Book book4 = new Book("JavaScript Absolute Beginner's Guide ", "Kirupa Chinnathambi", 2016);

        library.addBook(Book1);
        library.addBook(Book2);
        library.addBook(book3);
        library.addBook(book4);

        library.displayBooks();

        System.out.println("\n-------------------------- \n");

        // Adding ratings and reviews

        Book1.setRating(4.5);
        Book1.addReviews("Nice motivational book !!");
        Book1.addReviews("Inspiring !!!");

        Book2.setRating(5);
        Book2.addReviews("I love this book.");
        Book2.addReviews("Cartoons character are really nice.");
        Book2.addReviews(" Simple and easy to understand.");

        book3.setRating(3.5);
        book3.addReviews("Interesting !!!");

        book4.setRating(3.0);
        book4.addReviews("Nice book!!!");

        System.out.println("\n------------------------- \n");
        System.out.println("Average Rating of Books: " + library.getAverageRating()); // printing average rating

        Book mostReviewed = library.getMostReviewedBook();
        System.out.println("Most Reviewed Book is : " + mostReviewed.getBookTitle() +" by " + mostReviewed.getBookAuthor() + " got " + mostReviewed.getReviews().size() + " reviews." );


    }
}
