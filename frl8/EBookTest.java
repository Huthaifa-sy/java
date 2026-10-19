public class EBookTest {
    public static void main(String[] args) {
        // إنشاء كائن من فئة EBook
        EBook e = new EBook("Stormen", "Kari Nordmann", 2.4);
        
        // اختبار استعارة الكتاب الإلكتروني عدة مرات
        e.checkOut();
        e.checkOut();
        
        // طباعة النتيجة والتأكد من التفاصيل
        System.out.println(e);                      // النتيجة المتوقعة: Stormen av Kari Nordmann (e-bok, 2.4 MB)[cite: 45]
        System.out.println(e.isAvailable());        // النتيجة المتوقعة: true (لأن الكتاب الإلكتروني لا يصبح غير متاح أبداً)[cite: 45]
        System.out.println(e.getActiveLoans());     // النتيجة المتوقعة: 2[cite: 45]
    }
}