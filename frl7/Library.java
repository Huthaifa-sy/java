public class Library {
    private Book[] books = new Book[3];

    public Library() {
        // Fyller arrayen med bøker (simulerer konstruktør-initiering)[cite: 28]
        books[0] = new Book("Java Programming");
        books[1] = new Book("Algoritmer og Datastrukturer");
        books[2] = new Book("Database Systemer");
    }

    // Lineært søk etter bok basert på tittel[cite: 29, 30]
    public Book findBookByName(String title) {
        for (Book b : books) {
            if (b.getTitle().equals(title)) { // Bruker .equals() for String[cite: 18, 29]
                return b;
            }
        }
        return null;
    }

    // Sorterer bøkene alfabetisk ved hjelp av Selection Sort og compareTo()[cite: 29, 31]
    public void sortBooksByName() {
        for (int i = 0; i < books.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < books.length; j++) {
                if (books[j].getTitle().compareTo(books[minIndex].getTitle()) < 0) {
                    minIndex = j;
                }
            }
            // Bytter plass
            Book temp = books[i];
            books[i] = books[minIndex];
            books[minIndex] = temp;
        }
    }

    public void printBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }
}