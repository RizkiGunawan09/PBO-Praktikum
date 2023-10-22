abstract public class Shape {
    private String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    abstract double area();

    @Override
    public String toString() {
        return "shapeName = " + shapeName;
    }
}
