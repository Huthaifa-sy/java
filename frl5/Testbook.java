import java.util.Scanner;

public class Testbook {
    public static void main(String[] args) {
        Book b1 = new Book("Original tittel", "Jo NesbÃ¸");
        System.out.println("b1 tittel: " + b1.getTitle());
        System.out.println("b1 forfatter: " + b1.getAuthor());

        Scanner input = new Scanner(System.in);
        b1.setTitle(input);
        System.out.println("b1 ny tittel: " + b1.getTitle());

        Book b2 = new Book(b1);
        System.out.println("b2 (kopi) tittel: " + b2.getTitle());
        System.out.println("b2 (kopi) forfatter: " + b2.getAuthor());
        System.out.println("b2 available: " + b2.available);
    }
}