package demo;


public class IfExample {
    public static void main(String[] args) {
        int age = 20;
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        int num1 = 8;
        int num2 = 7;
        int correctAnswer = num1 + num2;

        if (correctAnswer == 15) {
            System.out.println("The answer is correct.");
        } else {
            System.out.println("The answer is incorrect.");
        }

    }
}
