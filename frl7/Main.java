public class Main {
    public static void main(String[] args) {
        System.out.println("=== TEST AV STUDENT-ARRAY ===");
        Student[] students = new Student[3];
        students[0] = new Student("Ola", 85.0);
        students[1] = new Student("Kari", 92.0);
        students[2] = new Student("Nils", 77.0);

        // 1. Skrive ut alle studenter ved hjelp av foreach-løkke
        System.out.println("Alle studenter:");
        for (Student s : students) {
            System.out.println(s.getName() + " med poengsum: " + s.getScore());
        }

        // 2. Finne gjennomsnittlig poengsum
        double sum = 0;
        for (Student s : students) {
            sum += s.getScore();
        }
        double average = sum / students.length;
        System.out.println("Gjennomsnittlig poengsum: " + average);

        // 3. Finne studenten med høyest poengsum
        Student best = students[0];
        for (Student s : students) {
            if (s.getScore() > best.getScore()) {
                best = s;
            }
        }
        System.out.println("Beste student: " + best.getName() + " (" + best.getScore() + ")");

        System.out.println("\n=== TEST AV LIBRARY OG BØKER ===");
        Library library = new Library();
        
        System.out.println("Før sortering:");
        library.printBooks();

        library.sortBooksByName();
        System.out.println("\nEtter alfabetisk sortering (Selection Sort):");
        library.printBooks();

        // Søke etter en bok
        String searchTitle = "Java Programming";
        Book found = library.findBookByName(searchTitle);
        if (found != null) {
            System.out.println("\nFant boken: " + found);
        } else {
            System.out.println("\nBoken ble ikke funnet.");
        }
    }
}