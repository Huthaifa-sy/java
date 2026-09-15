import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Ola", 85.00);

        Student s2 = new Student("Ola", 99.00);
        Student s6 = new Student(s1);

        System.out.println(s1.hasSameName(s2));

         s1.print();
        s2.print();
        s6.print();

            Scanner input = new Scanner(System.in);
         s2.setScore(input);
         s1.setScore2(input);
         s1.print();
        s2.print();

        s1.printReport(2);

        Student s3 = new Student("Arthur");
        Student s4 = new Student();
        Student s5 = new Student();
        s3.print();
        s4.print();
        s5.print();


    }


    



    



}
