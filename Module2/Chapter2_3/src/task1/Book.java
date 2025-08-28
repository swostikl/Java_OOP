package task1;

import java.util.ArrayList;

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private int publicationYear;

    private double rating;   // for task 4
    private ArrayList<String> reviews;  // for task 4

    public Book(String bookTitle, String bookAuthor, int publicationYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.publicationYear = publicationYear;
        this.rating = 0.0;      // for task 4
        this.reviews = new ArrayList<>(); //for task4
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

    // for task 4
    //get rating
    public double getRating() {
        return rating;
    }

    //set ratings
    public void setRating(double rating) {
        if(rating >= 0 && rating <= 5) {      //Rating from 0-5
            this.rating = rating;
        }else{
            System.out.println("Invalid rating. Choose between 0 and 5 !!");
        }
    }
    //Add reviews
    public void addReviews(String review) {
        reviews.add(review);
    }

    //get reviews
    public ArrayList<String> getReviews() {
        return reviews;
    }

}
