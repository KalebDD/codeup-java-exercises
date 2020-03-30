package shapes;

public class Rectangle {

    protected double width;
    protected double length;

    // constructor
    public Rectangle(double width, double length) {
        this.length = width;
        this.width = length;
    }

    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2*length + 2*width;
    }

    public String rectangleOutput() {
        String data = String.format("Rectangle Data:\n\tArea: %.3f\n\tPerimeter: %.3f", getArea(), getPerimeter());
        return data;
    }

}
