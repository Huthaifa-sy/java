public class Person {
    private Heart heart;
    private Brain brain;

    public Person() {
        // Komposisjon: Person oppretter hjerte og hjerne selv
        heart = new Heart();
        brain = new Brain();
    }

    public Heart getHeart() {
        return heart;
    }

    public Brain getBrain() {
        return brain;
    }
}