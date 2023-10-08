package Task_2;

public class TestShape {
    public static void main(String[] args) {
        System.out.println("c1: No parameter cunstructor");
        Shape shape1 = new Shape();
        System.out.println("color(before) = " + shape1.getColor());
        shape1.setColor("Blue");
        System.out.println("color(after) = " + shape1.getColor());
        System.out.println("filled(before) = " + shape1.isFilled());
        shape1.setFilled(false);
        System.out.println("filled(after) = " + shape1.isFilled());
        System.out.println(shape1.toString() + "\n");

        System.out.println("c2: Red, true");
        Shape shape2 = new Shape("Red", true);
        System.out.println("color(before) = " + shape2.getColor());
        shape2.setColor("Yellow");
        System.out.println("color(after) = " + shape2.getColor());
        System.out.println("filled(before) = " + shape2.isFilled());
        shape2.setFilled(false);
        System.out.println("filled(after) = " + shape2.isFilled());
        System.out.println(shape2.toString() + "\n");

        System.out.println("c2: Violet, false");
        Shape shape3 = new Shape("Violet", false);
        System.out.println("color(before) = " + shape3.getColor());
        shape3.setColor("Brown");
        System.out.println("color(after) = " + shape3.getColor());
        System.out.println("filled(before) = " + shape3.isFilled());
        shape3.setFilled(true);
        System.out.println("filled(after) = " + shape3.isFilled());
        System.out.println(shape3.toString());

        Circle circle = new Circle();
    }
}
