package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    //constructor
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getters
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    // Setters
    abstract void setLength(double length);
    abstract void setWidth(double width);
}
