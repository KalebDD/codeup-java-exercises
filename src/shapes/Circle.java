package shapes;

public class Circle {

    private double radius;

    // constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String circleData() {
        StringBuilder sb = new StringBuilder("Circle Data:\n");
        sb.append(String.format("\tRadius: %.3f\n", radius));
        sb.append(String.format("\tArea: %.3f\n", getArea()));
        sb.append(String.format("\tCircumference: %.3f\n", getCircumference()));
        return sb.toString();
    }
}
