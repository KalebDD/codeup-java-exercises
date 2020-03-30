package shapes;

import java.util.Scanner;

public class CircleApp {


    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the radius of your circle: ");
        int userRadius = scanner.nextInt();

        Circle circle = new Circle(userRadius);
        System.out.println(circle.circleData());
    }
}
