import java.util.ArrayList;

public class ShapeCalculator {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5.8));
        shapes.add(new Rectangle(12.3, 8.5));
        shapes.add(new Triangle(6.2, 9.4));

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
