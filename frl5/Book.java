import java.util.Scanner;

public class Book {
    String title;
    String author;
    boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public Book(Book other) {
        title = other.getTitle();
        author = other.getAuthor();
        available = true;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }

    public void setTitle(Scanner input) {
        String newTitle;
        do {
            System.out.print("Tittel: ");
            newTitle = input.nextLine();
        } while (newTitle.trim().isEmpty());
        title = newTitle;
    }
}