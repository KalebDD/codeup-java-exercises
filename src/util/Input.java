package util;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Input {

    // Create a new object called scanner - used to record keystrokes
    // Access modifier set to private - only accessible within the class
    // private Scanner scanner = new Scanner(System.in);

    // Better way - pass down the scanner from the calling function (not a good idea to take control of System.in stream in a function)
    // Basically, make sure your scanner is private

    // Initialize Scanner object called scanner
//    private static Scanner scanner;
//
//    //
////    // Set the scanner
//    public static void setScanner(Scanner input) {
//        scanner = input;
//    }
//
//
//    String getString() {
//        System.out.print("Please enter a word: ");
//        return scanner.nextLine();
//    }

    Scanner scanner = new Scanner(System.in);

//    static String getString() {
//        return getString();
//    }

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

//    int getInt() throws Exception {
//        System.out.println("Enter a number:");
//        try {
//            int userNum = Integer.parseInt(getString());
//            return userNum;
//        } catch (Exception e) {
//            System.out.println("This is a test for the catch");
//            return getInt();
//        }
//    }

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

    static double getDouble() throws Exception {
        Scanner scanner = new Scanner(System.in);
        double userNum = 0;
        boolean validInput = false;

        do {
                System.out.println("Enter a number:");
            try {
                userNum = scanner.nextDouble();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Invalid format.");
                scanner.nextLine();
                userNum = 0;
            }
        } while (!validInput);
        System.out.println(userNum + " is a number in Double form!");
        return userNum;
    }

    public static void main(String[] args) throws Exception {
        try {
            System.out.println(getDouble());
        } catch (Exception e) {
            System.out.println("How did we get here.");
        }

        // test to see if directory exists
        String dataPathName = "data";
        Path dataPath = Paths.get(dataPathName);
        if (Files.notExists(dataPath)) {
            Files.createDirectory(dataPath);
        }
        System.out.println(Files.exists(dataPath));
    }
}
