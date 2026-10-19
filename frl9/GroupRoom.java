public class GroupRoom implements Borrowable {
    private String roomNumber;
    private int capacity;
    private boolean available = true;

    public GroupRoom(String roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
    }

    @Override
    public void checkOut() {
        available = false;
    }

    @Override
    public void returnItem() {
        available = true;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "Grupperom " + roomNumber + " (" + capacity + " plasser)";
    }
}