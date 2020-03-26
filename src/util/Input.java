package util;

import java.util.Scanner;

public class Input {
    private Scanner s = new Scanner(System.in);

    String getString() {
        System.out.print("Enter your favorite color: ");
        String userInput = s.nextLine();
        return userInput;
    }

    boolean yesNo() {
        System.out.print("Enter yes or no: ");
        String userBoolean = s.nextLine();
        // not a great check - need more conditionals for variations of yes
        if (userBoolean.toLowerCase().contains("y")) {
            return true;
        } else {
            return false;
        }
    }

    int getInt(int min, int max) {
        int userNum = 0;
        System.out.print("Please enter a number: ");
        userNum = s.nextInt();

        while (userNum < min || userNum > max) {
            System.out.print("Number not in correct range - guess again: ");
            userNum = s.nextInt();
        }
        System.out.printf("Congratulations! Your number %d is in the range of %d - %d%n", userNum, min, max);
        return userNum;
    }

    int getInt() {
        System.out.print("Enter a number: ");
        int userInt = s.nextInt();
        return userInt;
    }

    double getDouble(double min, double max) {
        double userNum = 0;
        System.out.print("Please enter a decimal number: ");
        userNum = s.nextDouble();
        while (userNum < min || userNum > max) {
            System.out.print("Number not in correct range - guess again: ");
            userNum = s.nextDouble();
        }
        System.out.printf("Congratulations! Your number %.3f is in the range of %.3f - %.3f%n", userNum, min, max);
        return userNum;
    }

    double getDouble() {
        System.out.print("Enter a decimal number: ");
        double userDouble = s.nextDouble();
        return userDouble;
    }
}
