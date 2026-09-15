public class Student {

    private String name;
    private int score;

    // Konstruktør
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Gettere
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    // Settere
    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Oppgave 3: sammenlign score
    public boolean hasHigherScoreThan(Student other) {
        return this.score > other.getScore();
    }
}
