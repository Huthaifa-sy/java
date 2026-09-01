package demo;
// تعريف كلاس يمثل كتاب واحد في المكتبة
public class Book {

    // عنوان الكتاب
    String title;

    // اسم المؤلف
    String author;

    // حالة الكتاب: هل هو متاح أم مُستعار؟
    boolean available;

    // الـ constructor: يتم استدعاؤه عند إنشاء كتاب جديد
    Book(String newTitle, String newAuthor) {
        title = newTitle;       // تخزين العنوان
        author = newAuthor;     // تخزين المؤلف
        available = true;       // الكتاب يبدأ كـ "متاح"
    }

    // دالة لاستعارة الكتاب
    void checkOut() {
        if (available) {        // إذا كان الكتاب متاحًا
            available = false;  // يصبح مُستعارًا
        }
    }

    // دالة لإرجاع الكتاب
    void returnBook() {
        available = true;       // يصبح متاحًا مرة أخرى
    }
}
