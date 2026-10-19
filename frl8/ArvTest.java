public class ArvTest {
    public static void main(String[] args) {
        // إنشاء كائن من الفئة الفرعية MasterStudent
        MasterStudent g = new MasterStudent("Kari", 92, "Robotsyn");
        Student s = new Student("Ola", 85);
        System.out.println(s);
        System.out.println(s.getLoanDays());
        
        System.out.println("Navn: " + g.getName());
        System.out.println("Score: " + g.getScore());
        System.out.println("Tittel: " + g.getThesisTitle());
        System.out.println("Lånedager: " + g.getLoanDays());
        System.out.println("ToString: " + g.toString());
    }
}