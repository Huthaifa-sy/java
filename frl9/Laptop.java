public class Laptop implements Borrowable {
    private String serialNumber;
    private boolean available = true;

    public Laptop(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
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
}