public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Ola", 85);
        Student s2 = new Student("Kari", 60);

        System.out.println("Antall studenter: " + Student.getNumberOfStudents());
        System.out.println(s1.getName() +"="+ s1.getScore());
        System.out.println(s2.getName() + "=" + s2.getScore());

         StudentEncap s3 = new StudentEncap("Ola", 85);

        System.out.println("Før: " + s3.getScore());
        s3.setScore(95);
        System.out.println("Etter: " + s3.getScore());

        Book b1 = new Book("Java Programming", "Liang");

        System.out.println("Tittel: " + b1.getTitle());
        System.out.println("Forfatter: " + b1.getAuthor());
        System.out.println("Tilgjengelig: " + b1.isAvailable());

        b1.checkOut();
        System.out.println("Etter utlån: " + b1.isAvailable());

        b1.returnBook();
        System.out.println("Etter retur: " + b1.isAvailable());
    }
}
