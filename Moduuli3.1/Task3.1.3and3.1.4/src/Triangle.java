public class Triangle extends  Shape {
    private double theBase;
    private  double theHeight;

    public Triangle(double base, double height) {
        this.theBase = base;
        this.theHeight = height;
    }

    @Override
    public double calculateArea() {
        return (theBase*theHeight)/2;
    }

    /*@Override
    public String toString() {
        return  "The area of " + getClass().getName() + " with base of " + theBase
                + " and height of " + theHeight + " is " + calculateArea();
    }*/

    @Override
    public String toString() {
        return  super.toString() + getClass().getName() + ", Base: " + theBase
                + ", Height: " + theHeight + ", Area: " + calculateArea();
    }
}
