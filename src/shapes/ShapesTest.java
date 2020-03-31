package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape;

//      myShape = new Rectangle(2, 3);
        myShape = new Square(5);

        System.out.println("Area = " + myShape.getArea());
        System.out.println("Perimeter = " + myShape.getPerimeter());


//      INHERITANCE AND POLYMORPHISM EXERCISE CODE
//      Rectangle box1 = new Rectangle(4, 5);
//      System.out.println(box1.rectangleOutput());
//
//      Rectangle box2 = new Square(5);
//      System.out.println(box2.getPerimeter());
//      System.out.println(box2.getArea());
    }
}
