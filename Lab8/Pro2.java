public class Pro2 {
    public static void main(String[] args) {
        GeometricObject[] squares = { new Square(4.5), new Square(14), new Square(8.2), new Square(12),
                new Square(10) };

        for (int i = 0; i < squares.length; i++) {
            System.out.println("Square " + (i + 1));
            System.out.println("Area: " + squares[i].getArea());
            ((Square)squares[i]).howToColor();
        }
    }
}

class Square extends GeometricObject implements Colorable {
    double side = 1;

    public Square() {
    }

    public Square(double s) {
        side = s;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

}