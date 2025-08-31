public class Circle extends Shape{

    private double theRadius;

    public Circle (double radius) {
        this.theRadius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.theRadius, 2);
    }

    /*@Override
    public String toString() {
        return  "The area of " + getClass().getName() + " with radius of " + theRadius + " is " + calculateArea();
    }*/

    @Override
    public String toString() {
        return  super.toString()  + getClass().getName() + ", Radius: " + theRadius + ", Area: " + calculateArea();
    }
}
