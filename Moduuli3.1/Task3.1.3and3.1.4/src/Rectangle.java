public class Rectangle extends Shape {

    private double theHeight;
    private double theWidth;

    public Rectangle (double height, double width) {
        this.theHeight = height;
        this.theWidth = width;
    }

    @Override
    public double calculateArea() {
        return theHeight*theWidth;
    }

    /* @Override
    public String toString() {
        return  "The area of " + getClass().getName() + " with height of " + theHeight
                + " and width of " + theWidth + " is " + calculateArea();
    } */

    @Override
    public String toString() {
        return  super.toString()  + getClass().getName() + ", Height: " + theHeight
                + ", Width: " + theWidth + ", Area: " + calculateArea();
    }
}
