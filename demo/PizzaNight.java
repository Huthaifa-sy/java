package demo;
// تعريف كلاس يمثل ليلة بيتزا واحدة
public class PizzaNight {

    // عدد الأصدقاء
    int friends;

    // عدد الشرائح لكل شخص
    int slicesPerPerson;

    // مجموع الشرائح المطلوبة
    int totalSlices;

    // الـ constructor: يتم استدعاؤه عند إنشاء كائن جديد
    PizzaNight(int f, int s) {
        friends = f;               // تخزين عدد الأصدقاء
        slicesPerPerson = s;       // تخزين عدد الشرائح لكل شخص
        totalSlices = friends * slicesPerPerson;  // حساب مجموع الشرائح
    }

    public static void main(String[] args) {
        // إنشاء كائنين يمثلان ليلتين مختلفتين
        PizzaNight night1 = new PizzaNight(5, 3);   // ليلة أولى: 5 أصدقاء، 3 شرائح لكل شخص
        PizzaNight night2 = new PizzaNight(8, 4);   // ليلة ثانية: 8 أصدقاء، 4 شرائح لكل شخص

        // طباعة مجموع الشرائح لكل ليلة
        System.out.println(night1.totalSlices);   // يطبع: 15
        System.out.println(night2.totalSlices);   // يطبع: 32
    }
}
