package model;

import java.util.ArrayList;
import java.util.HashMap;

public class LibraryMember {

    private static int users;

    private String name;
    private int memberId;

    HashMap<String, Book> borrowedBooks = new HashMap<>();
    ArrayList<Book> reservedBooks = new ArrayList<>();


    public LibraryMember(String name) {
        users++;
        this.memberId = users;
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }


    public String getName() {
        return name;
    }

    public HashMap<String, Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }

    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }

    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }

    public ArrayList<Book> getReservedBooks() {
        return reservedBooks;
    }
}

