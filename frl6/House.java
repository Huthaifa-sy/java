public class House {
    private Room kitchen;
    private Room bedroom;

    public House() {
        // Komposisjon: Huset oppretter sine egne rom i konstruktøren
        kitchen = new Room();
        bedroom = new Room();
    }

    public Room getKitchen() {
        return kitchen;
    }

    public Room getBedroom() {
        return bedroom;
    }
}