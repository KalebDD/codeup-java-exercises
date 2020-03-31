package shapes;

public class Rectangle extends Quadrilateral implements  Measurable{

    // constructor
    public Rectangle(double length, double width) {
        super (length, width);
    }

    @Override
    void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return length*2 + width*2;
    }

    @Override
    public double getArea() {
        return length*width;
    }

//    INHERITANCE AND POLYMORPHISM EXERCISE CODE
//    protected double width;
//    protected double length;
//
//    // constructor
//    public Rectangle(double width, double length) {
//        this.length = width;
//        this.width = length;
//    }
//
//    public double getArea() {
//        return length * width;
//    }
//    public double getPerimeter() {
//        return 2*length + 2*width;
//    }
//
//    public String rectangleOutput() {
//        String data = String.format("Rectangle Data:\n\tArea: %.3f\n\tPerimeter: %.3f", getArea(), getPerimeter());
//        return data;
//    }

}
