import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        // 1
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f%n", pi);
//
//        System.out.format("The value of pi is approximately %.2f%n", pi);


        // Scanner Exercises
        Scanner input = new Scanner(System.in);

        // 1
//        System.out.print("Please enter your favorite number: ");
//        int userNumber = input.nextInt();
//        System.out.printf("Your favorite number is %d%n", userNumber);
//        //Q.1: Error thrown = InputMismatchException - something to do with casting
//
//        // 2
        System.out.println("Please enter 3 random words.");
        String firstWord = input.next();
        String middleWord = input.next();
        String lastWord = input.next();
        System.out.printf("%s, %s, and %s are your 3 words.%n", firstWord, middleWord, lastWord);
//        // Q.1: Cannot enter less than 3 words - have to enter something to move to next command
//        // Q.2: It doesn't pick up the 4th word - does it store it somewhere? Looks like it's wiped entirely
//
//
//        // 3
        System.out.println("Please enter your favorite quote.");
        String userQuote = input.nextLine();
        System.out.printf("Your quote: %s", userQuote);
//        // Q.1: Only picks up a single word. Discovery - whatever input is submitted, the .next method will pick up (ex: I entered dog 4 times in E.2, and my quote filled with 1 dog)



        // Calculate perimeter and area of Codeup's classroom

        // 1
//        System.out.println("Please enter the length of Codeup's classroom in feet");
//        int length = Integer.parseInt(input.nextLine());
//
//        System.out.println("Pleae enter the width of Codeup's classroom");
//        int width = Integer.parseInt(input.nextLine());
//
//        int area = length*width;
//        int perimeter = length*2 + width*2;
//
//        System.out.printf("Length: %dft%nWidth: %dft%nArea: %dft%nPerimeter: %dft%n", length, width, area, perimeter);

    }
}
