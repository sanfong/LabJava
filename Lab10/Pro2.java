import java.util.Scanner;

public class Pro2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            System.out.print("Three sides: ");
            Triangle t = new Triangle(scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), "Black", true);
            System.out.println(t);
        } catch (IllegalTriangleException e) {
            System.out.println("IllegalTriangleException: " + e.getLocalizedMessage());
        }
    }
}

class Triangle extends GeometricObject {
    double[] sides = { 1, 1, 1 };

    public Triangle() {
        super();
    }

    public Triangle(double a, double b, double c, String color, boolean filled) throws IllegalTriangleException{
        super(color, filled);
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException();
        }
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

class IllegalTriangleException extends Exception{
    public IllegalTriangleException() {
        super("The sum of any two sides is less than or equal to the other side.");
    }
}