public class Shape {

    private String colour = "Yellow";

    protected double calculateArea() {
        return 0;
    }

    @Override
    public String toString() {
        return  "A " + colour + " ";
    }
}
