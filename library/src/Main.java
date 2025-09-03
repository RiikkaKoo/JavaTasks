import model.Book;
import model.LibraryMember;
import system.Library;

public class Main {
    public static void main(String[] args) {

        Library theLibrary = new Library();

        LibraryMember member1 = new LibraryMember("Manu");
        LibraryMember member2 = new LibraryMember("Sirkka");

        theLibrary.addMember(member1);
        theLibrary.addMember(member2);

        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "9789510499399");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "9789510518878");
        Book book3 = new Book("The Silmarillion", "J.R.R. Tolkien", "9789510508626");
        Book book4 = new Book("Pride and Prejudice", "Jane Austen", "9789518515541");
        Book book5 = new Book("A Wild Sheep Chase", "Haruki Murakami", "9781784878771");
        Book book6 = new Book("Norwegian Wood", "Haruki Murakami", "9789520447106");

        theLibrary.addBook(book1);
        theLibrary.addBook(book2);
        theLibrary.addBook(book3);
        theLibrary.addBook(book4);
        theLibrary.addBook(book5);
        theLibrary.addBook(book6);

        theLibrary.displayBooks();
        System.out.println();

        theLibrary.borrowBook(member1, book2);
        theLibrary.borrowBook(member1, book5);
        theLibrary.borrowBook(member2, book4);
        theLibrary.borrowBook(member2, book5);
        System.out.println();

        theLibrary.displayBooks();
        System.out.println();

        theLibrary.returnBook(member1, book2);
        theLibrary.returnBook(member1, book1);
        System.out.println();

        // --------------------------------------------------------------- //
        // TASK 3 TESTS:

        theLibrary.reserveBook(member1, book3);
        theLibrary.reserveBook(member1, book6);
        theLibrary.reserveBook(member2, book3);
        System.out.println();

        theLibrary.displayReservedBooks(member1);
        System.out.println();

        theLibrary.cancelReservation(member1, book6);
        theLibrary.cancelReservation(member2, book1);
        System.out.println();

        theLibrary.displayReservedBooks(member1);
        System.out.println();
    }
}
