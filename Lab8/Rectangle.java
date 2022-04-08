// Program 3

public class Rectangle extends GeometricObject implements Comparable<GeometricObject> {
    double width;
    double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return width * 2 + height * 2;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof GeometricObject)) {
            return false;
        }
        return getArea() == ((GeometricObject)o).getArea();
    }

    @Override
    public int compareTo(GeometricObject o) {
        double dif = getArea() - o.getArea();
        return (Math.abs(dif) < 1 && dif != 0) ? (int)(dif / Math.abs(dif)) : (int)dif;
    }
}