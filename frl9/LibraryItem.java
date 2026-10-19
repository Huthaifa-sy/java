public abstract class LibraryItem implements Borrowable {
    private String title;
    private boolean available = true;

    public LibraryItem(String title) {
        this.title = title;
    }

    public String getTitle() { 
        return title; 
    }

    public boolean isAvailable() { 
        return available; 
    }

    public void checkOut() { 
        available = false; 
    }

    public void returnItem() { 
        available = true; 
    }

    public abstract double getLateFee(int daysLate);

    @Override
    public String toString() {
        return title;
    }
}