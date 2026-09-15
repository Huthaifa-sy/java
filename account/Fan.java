public class Fan {

    // Konstanter
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private felter
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    // Konstruktør uten parametere
    public Fan() {
    }

    // Gettere og settere
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString-metode
    @Override
    public String toString() {
        if (on) {
            return "speed=" + speed + " color=" + color + " radius=" + radius;
        } else {
            return "color=" + color + " radius=" + radius + " fan is off";
        }
    }
}
