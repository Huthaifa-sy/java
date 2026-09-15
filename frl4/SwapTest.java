public class SwapTest {

    public static void swap1(StudentEncap x, StudentEncap y) {
        StudentEncap temp = x;
        x = y;
        y = temp;
    }

    public static void swap2(StudentEncap x, StudentEncap y) {
        double tempScore = x.getScore();
        x.setScore(y.getScore());
        y.setScore(tempScore);
    }

    public static void main(String[] args) {

        StudentEncap s1 = new StudentEncap("Ola", 85);
        StudentEncap s2 = new StudentEncap("Kari", 60);

        System.out.println("Før swap1: " + s1.getName() + " = " + s1.getScore());
        swap1(s1, s2);
        System.out.println("Etter swap1: " + s1.getName() + " = " + s1.getScore());

        System.out.println("Før swap2: " + s1.getName() + " = " + s1.getScore());
        swap2(s1, s2);
        System.out.println("Etter swap2: " + s1.getName() + " = " + s1.getScore());
    }
}
