package shapes;

public class Square extends Quadrilateral {

    // constructor
    public Square(double side) {
        super (side, side);
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
        return 4*length;
    }

    @Override
    public double getArea() {
        return Math.pow(width, 2);
    }

//    INHERITANCE AND POLYMORPHISM EXERCISE CODE
//    // constructor
//    public Square(double side) {
//        super(side, side);
//    }
//
//    @Override
//    public double getPerimeter() {
//        System.out.println("Test - coming from square");
//        return 4 * length;
//    }
//
//    @Override
//    public double getArea() {
//        System.out.println("Test - coming from square");
//        return Math.pow(length, 2);
//    }
}
