public class RegularPolygon {

    // Private datafelt
    private int n = 3;          // antall sider
    private double side = 1;    // lengde på hver side
    private double x = 0;       // x-koordinat for sentrum
    private double y = 0;       // y-koordinat for sentrum

    // Konstruktør uten parametere
    public RegularPolygon() {
    }

    // Konstruktør med n og side (sentrert i (0,0))
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    // Konstruktør med n, side, x og y
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // Gettere og settere
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Omkrets = n * side
    public double getPerimeter() {
        return n * side;
    }

    // Areal = (n * side^2) / (4 * tan(PI / n))
    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
