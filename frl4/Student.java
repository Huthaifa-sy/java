public class Student {
    private String name;
    private double score;
    private static int numberOfStudents = 0;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
        numberOfStudents++;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        }
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }
}
