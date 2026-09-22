public class Main {
    public static void main(String[] args) {
        // Test av aggregering (Student og Book)
        Student student = new Student("Ola", 85.0);
        Book book = new Book("Kaffehuset", "Ola Nordmann");
        
        student.borrowBook(book);
        System.out.println("Student: " + student.getName() + " lånte boken: " + student.getBorrowedBook().getTitle());

        // Test av komposisjon (House og Room)
        House house = new House();
        if (house.getKitchen() != null) {
            System.out.println("Huset har et kjøkken (Komposisjon - opprettet i konstruktøren).");
        }

        Person person = new Person();
        if (person.getHeart() != null) {
            System.out.println("Personen har et hjerte (Komposisjon - opprettet i konstruktøren).");
        }

        // Sjekker om hjernen finnes (ikke er null)
        if (person.getBrain() != null) {
            System.out.println("Personen har en hjerne (Komposisjon - opprettet i konstruktøren).");
        }
    }
}