package Task_1;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2*Math.PI*getRadius()*height + 2*super.getArea();
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {      // in Cylinder class
        return "Cylinder: subclass of " + super.toString()  // use Circle's toString()
                + " height=" + height;
    }
}
