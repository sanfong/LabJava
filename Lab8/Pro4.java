public class Pro4 {
    public static void main(String[] args) throws Exception {
        Octagon oc = new Octagon(5);
        System.out.println("Area: " + oc.getArea()); 
		System.out.println("Perimeter: " + oc.getPerimeter());

        Octagon oc2 = oc.clone();
        System.out.println("Compare: " + oc.compareTo(oc2));
    }
}

class Octagon extends GeometricObject implements Comparable<GeometricObject>, Cloneable {
    private double side;

	public Octagon() {
	}

	public Octagon(double side) {
		this.side = side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	public double getPerimeter() {
		return 8 * side;
	}

    @Override
    public int compareTo(GeometricObject o) {
        double dif = getArea() - o.getArea();
        return (Math.abs(dif) < 1 && dif != 0) ? (int)(dif / Math.abs(dif)) : (int)dif;
    }

    @Override
    protected Octagon clone() throws CloneNotSupportedException {
        return (Octagon)super.clone();
    }
}