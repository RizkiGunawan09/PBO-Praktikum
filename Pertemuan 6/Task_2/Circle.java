package Task_2;

public class Circle extends Shape{
    private double radius;

    Circle() {
        super();
        radius = 1.0;
    }

    Circle(double radius) {
        super();
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is " + "a subclass of \n"
                + super.toString();
    }
}
