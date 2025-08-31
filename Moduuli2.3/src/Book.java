import java.util.ArrayList;

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private int publicationYear;
    private double bookRating = -1;
    private ArrayList<String> bookReviews = new ArrayList<>();

    // private ArrayList<Double> bookRatings = new ArrayList<>();

    public Book(String title, String author, int year) {
        this.bookTitle = title;
        this.bookAuthor = author;
        this.publicationYear = year;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setRating(double rating) {
        this.bookRating = rating;
    }

    /* public void addRating(double rating) {
        this.bookRatings.add(rating);
    } */

    public double getBookRating() {
        return bookRating;
    }

    public void addReview(String review) {
        this.bookReviews.add(review);
    }

    public ArrayList<String> getBookReviews() {
        return bookReviews;
    }

}