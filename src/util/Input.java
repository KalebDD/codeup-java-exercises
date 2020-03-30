package util;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    String getString() {
        System.out.print("Enter your favorite color: ");
        String userInput = scanner.nextLine();
        return userInput;
    }

    boolean yesNo() {
        System.out.print("Enter yes or no: ");
        String userBoolean = scanner.nextLine();
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
        userNum = scanner.nextInt();

        while (userNum < min || userNum > max) {
            System.out.print("Number not in correct range - guess again: ");
            userNum = scanner.nextInt();
        }
        System.out.printf("Congratulations! Your number %d is in the range of %d - %d%n", userNum, min, max);
        return userNum;
    }

    int getInt() {
        System.out.print("Enter a number: ");
        int userInt = scanner.nextInt();
        return userInt;
    }

    double getDouble(double min, double max) {
        double userNum = 0;
        System.out.print("Please enter a decimal number: ");
        userNum = scanner.nextDouble();
        while (userNum < min || userNum > max) {
            System.out.print("Number not in correct range - guess again: ");
            userNum = scanner.nextDouble();
        }
        System.out.printf("Congratulations! Your number %.3f is in the range of %.3f - %.3f%n", userNum, min, max);
        return userNum;
    }

    double getDouble() {
        System.out.print("Enter a decimal number: ");
        double userDouble = scanner.nextDouble();
        return userDouble;
    }
}
