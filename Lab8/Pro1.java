import java.util.Scanner;

public class Pro1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.print("Enter color: ");
        t.setColor(scan.nextLine());
        System.out.print("Is filled: ");
        t.setFilled(scan.nextBoolean());
        System.out.print("Enter 3 sides: ");
        t.setSides(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
        System.out.println(t);
    }
}

class Triangle extends GeometricObject {
    double[] sides = { 1, 1, 1 };

    public Triangle() {
        super();
    }

    public Triangle(double a, double b, double c, String color, boolean filled) {
        super(color, filled);
        setSides(a, b, c);
    }

    public double getSides(int i) {
        return sides[i];
    }

    public void setSides(double a, double b, double c) {
        sides[0] = a;
        sides[1] = b;
        sides[2] = c;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]));
    }

    @Override
    public double getPerimeter() {
        return sides[0] + sides[1] + sides[2];
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Area: " + getArea() + "\n" +
                "Perimeter: " + getPerimeter();
    }
}