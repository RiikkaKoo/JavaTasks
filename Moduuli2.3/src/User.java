import java.util.ArrayList;

public class User {
    private String userName;
    private int userAge;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public User(String name, int age) {
        this.userAge = age;
        this.userName = name;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return this.borrowedBooks;
    }

    public void displayBorrowedBooks() {
        for (Book b : borrowedBooks) {
            System.out.println("     Title: \"" + b.getBookTitle() + "\", Author: \"" + b.getBookAuthor() + "\"");
        }
    }

    public String getUserName() {
        return this.userName;
    }

    public int getUserAge() {
        return userAge;
    }
}