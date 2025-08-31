public class LibraryMain {
    public static void main(String[] args) {

        Library myLibrary = new Library(); // The library object

        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1968);
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        Book book3 = new Book("The Silmarillion", "J.R.R. Tolkien", 1977);
        Book book4 = new Book("Pride and Prejudice", "Jane Austen", 1813);
        Book book5 = new Book("A Wild Sheep Chase", "Haruki Murakami", 1982);
        Book book6 = new Book("Norwegian Wood", "Haruki Murakami", 1987);

        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);
        myLibrary.addBook(book4);
        myLibrary.addBook(book5);
        myLibrary.addBook(book6);

        User user1 = new User("Manu", 29);
        User user2 = new User("Ulla", 45);

        myLibrary.addUser(user1);
        myLibrary.addUser(user2);


        // ---------------------------------------------------------------------------------- //
        //  TESTING METHODS:
        // ---------------------------------------------------------------------------------- //

        myLibrary.displayBooks();

        myLibrary.findBooksByAuthor("J.R.R. Tolkien");

        myLibrary.borrowBook("Norwegian Wood", user1);
        myLibrary.borrowBook("The Hobbit", user1);
        myLibrary.borrowBook("Pride and Prejudice", user2);

        System.out.println("\nBook \"Norwegian Wood\" is available?  " + myLibrary.isBookAvailable("Norwegian Wood"));

        myLibrary.displayBooks();

        myLibrary.returnBook(book6, user1); // Palauta Norwegian Wood

        myLibrary.getLibraryUserInfo();

        System.out.println("\nBook \"Norwegian Wood\" is available?  " + myLibrary.isBookAvailable("Norwegian Wood"));

        myLibrary.displayBooks();

        myLibrary.reviewABook("This is a real classic!", book1);
        // book1.addReview("This is a real classic!"); // Voi tehdä myös näin, eli tuota Libraryn omaa metodia
                                                       // ei siis periaatteessa tarvita. Jos kirjat luotaisiin suoraan addBook-metodissa,
                                                       // niin silloin tuo libraryn oma reviewBook metodi voisi olla hyödyllisempi,
                                                       // jos sitä muokkaisi etsimään kirjan esim. titlen perusteella.
        myLibrary.reviewABook("A must read for every fantasy lover.", book1);
        myLibrary.reviewABook("A classic for a reason.", book4);

        myLibrary.rateABook(9.5, book2);
        // book2.setRating(9.5); // Tästä vähän samoja ajatuksia, kuin tuossa ylempänä.
        myLibrary.rateABook(7.0, book5);
        myLibrary.rateABook(8.0, book6);
        myLibrary.rateABook(8.5, book1);
        myLibrary.rateABook(8.5, book3);
        myLibrary.rateABook(9.0, book4);

        System.out.println("\nThe most reviewed book is \"" + myLibrary.getMostReviewedBook().getBookTitle()
                + "\" by Author \"" + myLibrary.getMostReviewedBook().getBookAuthor() + "\" with "
                + myLibrary.getMostReviewedBook().getBookReviews().size() + " reviews.");

        System.out.printf("\nThe average rating of all the rated books in the library is %.2f / 10.", myLibrary.getAverageBookRating());
    }
}
