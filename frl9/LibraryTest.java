import java.util.Arrays;

public class LibraryTest {

    public static void main(String[] args) {
        // 1. إنشاء الكائنات المختلفة (من كلاسات ترث LibraryItem وتطبق Borrowable)
        Film stormen = new Film("Stormen", 95);
        Film nordlys = new Film("Nordlys", 95);
        Laptop laptop = new Laptop("L-042");
        GroupRoom room = new GroupRoom("A-101", 6);
        Film kaffehuset = new Film("Kaffehuset", 95);

        // 2. اختبار الواجهة Borrowable في مصفوفة مشتركة
        Borrowable[] borrowables = { laptop, room };
        
        // استعارة أو حجز بعض العناصر
        room.checkOut(); 
        laptop.checkOut();

        System.out.println("--- اختبار countAvailable ---");
        System.out.println("Antall tilgjengelige elementer: " + countAvailable(borrowables)); 
        // النتيجة ستكون: 0 لأن القاعة واللابتوب محجوزان.

        System.out.println("\n--- اختبار تفاصيل القاعة ---");
        System.out.println(room); // يستدعي toString() الخاصة بـ GroupRoom

        // 3. اختبار الكلاسات المجرّدة وحساب رسوم التأخير (totalFee)
        LibraryItem[] libraryItems = { stormen, nordlys, kaffehuset };
        
        System.out.println("\n--- اختبار totalFee (رسوم التأخير لمدة 3 أيام) ---");
        double totalLateFee = totalFee(libraryItems, 3);
        System.out.println("Totalt gebyr: " + totalLateFee + " kr"); 
        // العناصر الثلاثة أفلام، وتُحسب رسوم التأخير حسب تنفيذ getLateFee في Film.

        // 4. اختبار الترتيب باستخدام Comparable (Arrays.sort)
        System.out.println("\n--- اختبار الترتيب (Arrays.sort) ---");
        Arrays.sort(libraryItems); // يترتب تصاعدياً حسب العنوان (Title)
        for (LibraryItem item : libraryItems) {
            System.out.println(item);
        }
    }

    // --- الدوال المساعدة (Helper Methods) المذكورة في الشرح ---

    // دالة لحساب عدد العناصر المتاحة التي تطبق Borrowable
    public static int countAvailable(Borrowable[] items) {
        int count = 0;
        for (Borrowable b : items) {
            if (b.isAvailable()) {
                count++;
            }
        }
        return count;
    }

    // دالة لحساب إجمالي رسوم التأخير لكل عناصر المكتبة (برمجة عبر التجريد)
    public static double totalFee(LibraryItem[] items, int daysLate) {
        double sum = 0;
        for (LibraryItem item : items) {
            sum = sum + item.getLateFee(daysLate);
        }
        return sum;
    }
}