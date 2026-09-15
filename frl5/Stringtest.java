import java.util.Locale;

public class Stringtest {
    public static void main(String[] args) {

        int age = 18;
        if (age == 18)
            System.out.println("Adult");

        // String sammenligning
        String name = new String("ola");

        // name2 peker på samme objekt som name
        String name2 = name;

        // name3 er et nytt objekt med samme innhold
        String name3 = new String("ola");

        // == sammenligner referanser
        if (name == name2)
            System.out.println("Welcome ola (samme objekt)");

        if (name == name3)
            System.out.println("Dette skrives nesten aldri"); // vil ikke skje

        // equals sammenligner innhold
        if (name.equals(name3))
            System.out.println("welcome Ola (equals)");

        // equalsIgnoreCase ignorerer store/små bokstaver
        if (name.equalsIgnoreCase(name3))
            System.out.println("welcome Ola (ignore case)");

        // String metoder
        String fullName = "Ahmed Saod";

        System.out.println(fullName.length());
        System.out.println(fullName.charAt(0));
        System.out.println(fullName.charAt(2));
        System.out.println(fullName.substring(6, 10));
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.trim());
        System.out.println(fullName);
    }
}
