package task4;

import task1.Book;
import task1.Library;

public class BookRatingsReviews {
    public static void main(String[] args){
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

        Book2.setRating(5);
        Book2.addReviews("I love this book.");

        //printing reviews

        System.out.println(Book1);
        System.out.println("Rating for " + Book1.getBookTitle() + " is " + Book1.getRating());
        System.out.println("  Reviews for " + Book1.getBookTitle() + ", " + Book1.getReviews());

        System.out.println("\n-------------------------- \n");

        System.out.println(Book2);
        System.out.println(" Ratings for " + Book2.getBookTitle() + ", " + Book2.getRating());
        System.out.println(" Reviews for " + Book2.getReviews());






    }
}