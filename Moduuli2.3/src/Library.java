import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void displayBooks() {
        int catalogItem = 0;
        System.out.println("\nLibrary Catalog: ");
        for (Book book : books) {
            catalogItem++;
            System.out.println("  " + catalogItem + ". Title: \"" + book.getBookTitle() + "\", Author: \"" + book.getBookAuthor() + "\", Year: " + book.getPublicationYear());
        }
    }

    public void getLibraryUserInfo() {
        System.out.println("\nLibrary users: ");
        for (User u : users) {
            System.out.println("  User: \"" + u.getUserName() + "\", Age: \"" + u.getUserAge() + "\"");
            System.out.println("    Books borrowed: ");
            u.displayBorrowedBooks();
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("\nBooks by Author \"" + author + "\": ");
        for (Book book : books) {
            if (author.equals(book.getBookAuthor())) {
                System.out.println("     Title: \"" + book.getBookTitle() + "\", Year: " + book.getPublicationYear());
            }
        }
    }

    public void borrowBook(String title, User user) {
        boolean bookAvailable = false;
        for (Book book : books) {
            String t = book.getBookTitle();
            if (t.equals(title)) {
                bookAvailable = true;
                System.out.println("\n\"" + book.getBookTitle() + "\" by Author \"" + book.getBookAuthor()
                        + "\" was borrowed by " + user.getUserName());
                user.getBorrowedBooks().add(book);
                books.remove(book);
                break;
            }
        }
        if (!bookAvailable) {
            System.out.println(title + " is not available.");
        }
    }

    public void returnBook(Book book, User user) {
        addBook(book);
        System.out.println("\n\"" + book.getBookTitle() + "\" by Author \"" + book.getBookAuthor()
                + "\" was returned by " + user.getUserName());
        user.getBorrowedBooks().remove(book);
    }

    public boolean isBookAvailable(String title) {
        boolean bookAvailable = false;
        for (Book book : books) {
            String t = book.getBookTitle();
            if (t.equals(title)) {
                bookAvailable = true;
                break;
            }
        }
        return bookAvailable;
    }

    public void reviewABook(String review, Book book) {
        for (Book b : books) {
            if (b.equals(book)) {
                b.addReview(review);
            }
        }
    }

    /* En ollut ihan varma haluttiinko tehtävässä, että kirjoille voi antaa useamman arvion (arvosanana?),
    mutta "set a rating", mielestäni viittaa siihen että kirjalle asetetaan uusi arvio (0-10).
     */
    public void rateABook(Double rating, Book book) {
        for (Book b : books) {
            if (b.equals(book)) {
                b.setRating(rating);
            }
        }
    }

    public double getAverageBookRating() {
        double ratingSum = 0;
        int ratedBooks = 0;
        for (Book book : books) {
            if (book.getBookRating() >= 0) {
                ratingSum += book.getBookRating();
                ratedBooks++;
            }
        }
        return ratingSum / ratedBooks;
    }

    public Book getMostReviewedBook() {
        Book mostReviewed = null;
        int mostRews = 0;
        for (Book book : books) {
            int rews = book.getBookReviews().size();
            if (rews > mostRews) {
                mostReviewed = book;
                mostRews = rews;
            }
        }
        return mostReviewed;
    }
}
