public class StudentEncap {
    private String name;
    private double score;

    public StudentEncap(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score >= 0 && score <= 100) {
            this.score = score;   // this brukes her
        }
    }
}
