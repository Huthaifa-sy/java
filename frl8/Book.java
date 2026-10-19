public class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() { return title; }
    public boolean isAvailable() { return available; }
    
    public void checkOut() {
        if (available) { available = false; }
    }

    public void returnBook() { available = true; }

    @Override
    public String toString() {
        return title + " av " + author;
    }
}

class EBook extends Book {
    private double fileSizeMB;
    private int activeLoans;

    public EBook(String title, String author, double fileSizeMB) {
        super(title, author); // (1) تعيين العنوان والمؤلف عبر الفئة الأساسية
        this.fileSizeMB = fileSizeMB; // (2) تعيين الحجم الخاص بالكتاب الإلكتروني
        this.activeLoans = 0;
    }

    public int getActiveLoans() { 
        return activeLoans; 
    }

    @Override
    public void checkOut() {
        // (3) الكتاب الإلكتروني لا يصبح غير متاح أبداً، فقط نزيد عداد الاستعارات
        activeLoans++;
    }

    @Override
    public String toString() {
        // (4) إعادة استخدام toString الأساسية وإضافة تفاصيل الكتاب الإلكتروني
        return super.toString() + " (e-bok, " + fileSizeMB + " MB)";
    }
}