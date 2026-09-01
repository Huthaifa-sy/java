package demo;

public class Main {
    public static void main(String[] args) {

        // تشغيل كلاس Student
        Student s1 = new Student("Ola", 85.0);
        Student s2 = new Student("Kari", 93.0);

        System.out.println("Student grades:");
        System.out.println(s1.getGrade());   // B
        System.out.println(s2.getGrade());   // A

        // تشغيل كلاس Book
        Book b1 = new Book("Kaffehuset", "Ola Nordmann");
        Book b2 = new Book("Havet", "Kari Hansen");

        b1.checkOut(); // استعارنا الكتاب الأول
        b2.checkOut(); // استعارنا الكتاب الثاني

        System.out.println("\nBook status:");
        if (b1.available) {
            System.out.println(b1.title + " er ledig");
        } else {
            System.out.println(b1.title + " er utlånt");
        }

        if (b2.available) {
            System.out.println(b2.title + " er ledig");
        } else {
            System.out.println(b2.title + " er utlånt");
        }
    }
}
