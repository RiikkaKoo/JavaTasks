package system;

import model.Book;
import model.LibraryMember;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    HashMap<String, Book> books = new HashMap<>();
    ArrayList<LibraryMember> members = new ArrayList<>();

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void displayBooks() {
        System.out.println("\nBOOKS IN THE LIBRARY:");
        for (HashMap.Entry<String, Book> entry : books.entrySet()) {
            System.out.println("Title: \"" + entry.getValue().getTitle() + "\", Author: \""
                    + entry.getValue().getAuthor() + "\", ISBN: " + entry.getValue().getIsbn());
        }
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (books.containsKey(book.getTitle())) {
            books.remove(book.getTitle());
            member.getBorrowedBooks().put(book.getTitle(), book);
            System.out.println("User " + member.getMemberId() + ", " + member.getName()
                    + ", borrowed book \"" + book.getTitle() + "\".");
        } else {
            System.out.println("The book titled \"" + book.getTitle() + "\" is not available.");
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        if (member.getBorrowedBooks().containsKey(book.getTitle())) {
            member.getBorrowedBooks().remove(book.getTitle());
            books.put(book.getTitle(), book);
            System.out.println("\"" + book.getTitle() + "\" was returned by User " + member.getMemberId() + ", " + member.getName());
        } else {
            System.out.println("User " + member.getMemberId() + ", " + member.getName() + ", does not have this book.");
        }
    }

    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book \"" + book.getTitle() + "\" reserved by User " + member.getMemberId() + ", " + member.getName() + ".");
        } else {
            System.out.println("Book \"" + book.getTitle() + "\" is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("User " + member.getMemberId() + "'s reservation canceled successfully.");
        } else {
            System.out.println("Book \"" + book.getTitle() + "\" was not reserved by User " + member.getMemberId() + ", " + member.getName() + ".");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println("   \"" + book.getTitle() + "\"");
        }
    }
}
