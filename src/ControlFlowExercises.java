import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        // 1.a
        int i = 5;
        while (i <= 15) {
            System.out.printf("I is now: %d%n", i);
            i++;
        }

        // 1.b
        int even = 2;
        do {
            System.out.println(even);
            even = (int) Math.pow(even, 2);
        } while (even < 1_000_000);

        // 2
        for (int n = 1; n <= 100; n++) {
            if (n % 3 == 0) {
                if (n % 5 == 0) {
                    System.out.println("FizzBuzz");
                    continue;
                }
                System.out.println("Fizz");
            } else if (n % 5 == 0) {
                System.out.println(("Buzz"));
            } else {
                System.out.printf("%d%n", i);
            }
        }

        // 3
        Scanner input = new Scanner(System.in);

        String confirmation = "Y";

        while (confirmation.equalsIgnoreCase("y")) {
            System.out.println("What number would you like to go up to?");
            int userNumber = Integer.parseInt(input.next());

            // Creating header of 3 columns (number, squared, cubed)
            for (int x = 1; x <= 3; x++) {
                if (x == 1) {
                    System.out.print("number\t");
                } else if (x == 2) {
                    System.out.print("|\tsquared\t");
                } else {
                    System.out.print("|\tcubed\n");
                }
            }
            // Creating line break between header and table
            for (int y = 1; y <= 3; y++) {
                if ((y == 1) || (y == 2)) {
                    System.out.print("------\t|\t");
                } else {
                    System.out.print("------\n");
                }
            }
            // Creating table? Formatting isn't precise when digits exceed 1 char in length
            for (int num = 1; num <= userNumber; num++) {
                String line = "|";

                for (int z = 1; z <= 3; z++) {
                    if (z == 1) {
                        System.out.printf("%.0f", Math.pow(num, i));
                    } else if (z == 2) {
                        System.out.printf("%8s \t%.0f", line, Math.pow(num, i));
                    } else {
                        System.out.printf("%8s \t%.0f", line, Math.pow(num, i));
                    }
                }
                System.out.println();
            }
        System.out.println("Would you like to continue? [Y/N]");
        confirmation = input.next();
        }

        System.out.println("Exiting");

        // 4
        System.out.println("What numerical grade did you receive on your last assignment?");
        int userGrade = Integer.parseInt(input.next());
        String convertedGrade = "";

        if (userGrade >= 88 && userGrade <= 100) {
            convertedGrade = "A";
        } else if (userGrade >= 80) {
            convertedGrade = "B";
        } else if (userGrade >= 67) {
            convertedGrade = "C";
        } else if (userGrade >= 60) {
            convertedGrade = "D";
        } else {
            convertedGrade = "F";
        }

        System.out.printf("Your grade is : %s", convertedGrade);
    }
}
