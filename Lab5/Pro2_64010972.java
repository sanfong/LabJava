public class Pro2_64010972 {
    public static void main(String[] args) {
        RegularPolygon tri = new RegularPolygon();
        System.out.println("tri: " + tri.getPerimeter() + ", " + tri.getArea());
        RegularPolygon hex = new RegularPolygon(6, 4);
        System.out.println("hex: " + hex.getPerimeter() + ", " + hex.getArea());
        RegularPolygon dec = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("dec: " + dec.getPerimeter() + ", " + dec.getArea());
    }
}

class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {}

    public RegularPolygon(int n, double length) {
        this.n = n;
        side = length;
    }

    public RegularPolygon(int n, double length, double xpos, double ypos) {
        this.n = n;
        side = length;
        x = xpos;
        y = ypos;
    }

    public double getPerimeter() {
        return side * n;
    }

    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(int length) {
        side = length;
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
}