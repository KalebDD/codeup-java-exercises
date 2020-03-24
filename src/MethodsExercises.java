import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
//        System.out.println(add(2, 5));
//        System.out.println(subtract(4, 2));
//        System.out.println(multiply(9, 5));
//        System.out.println(divide(2, 1));
//        System.out.println(modulus(5, 2));
//        int userInput = getInteger(1, 10);
//        System.out.println(factorial());
        System.out.println(dicePrompt());
    }


    // Q.1
    //ADD 2 NUMBERS
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // SUBTRACT 2 NUMBERS
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // MULTIPLY 2 NUMBERS
    public static int multiply(int num1, int num2) {
        // METHOD 1
        // return num1 * num2;

        // METHOD 2
        // int sum = 0;
        // for (var i = 1; i <= num1; i++) {
        //     sum += num2;
        // }
        // return sum;

        // METHOD 3
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else {
            return num1 + multiply(num1, num2 - 1);
        }
    }

    // DIVIDE 2 NUMBER
    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    // REMAINDER OF 2 NUMBERS
    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    // foodForThought: error - ArithmeticException when dividing by 0
    // B.a: L.13-18
    // B.b: L.20-25


    // Q.2
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userNumber = scanner.nextInt();

        if (userNumber > min && userNumber < max) {
            System.out.println("Congratulations! Your number is in range!");
        } else {
            System.out.println("Sorry, your number is not in range. Please try again.");
            getInteger(min, max);
        }
        return userNumber;
    }


    // Q.3
    public static int factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userNumber = scanner.nextInt();

        if (userNumber >= 1 && userNumber <= 10) {
            System.out.println("Would you like to continue? [Y/N] ");
            String confirmation = scanner.next();
            if (confirmation.equalsIgnoreCase("y")) {
                for (int i = userNumber - 1; i > 0; i--) {
                    userNumber *= i;
                }
                System.out.println("The factorial of your number is: " + userNumber);
            }
        } else {
            System.out.println("Number not in range - please try again.");
            return factorial();
        }
        return userNumber;
    }
//    public static int factorial() {
//        int userNumber = getInteger(1, 10);
//        int factorialNumber = 1;
//
//        for (int i = 1; 1 <=userNumber; i++) {
//            factorialNumber *= i;
//        }
//        return factorialNumber;
//    }


    // Q.4
    public static int diceRoll(int num) {
        int diceRoll = (int) (Math.random() * num) + 1;
        return diceRoll;
    }

    public static int dicePrompt() {
        System.out.println("Roll the dice! How many sides does your dice have?");
        Scanner scanner = new Scanner(System.in);
        int diceSides = scanner.nextInt();

        System.out.printf("Your first roll is: %d%n", diceRoll(diceSides));
        System.out.printf("Your second roll is: %d%n", diceRoll(diceSides));
        return diceSides;
    }
}
