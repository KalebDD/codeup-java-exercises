import java.util.Scanner;

public class HighLow {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int userNum = 0;
        int totalGuesses = 0;
        String playAgain;

        do {
            int randomNum = randomNumber100();

            System.out.println("\nLet's play HighLow! \nEnter a number between 1-100, and see how long it takes to guess the correct number!");
            System.out.print("Enter Your Number: ");
            userNum = Integer.parseInt(scanner.nextLine());

            do {
                if (randomNum < userNum) {
                    System.out.println("Lower!");
                    totalGuesses++;
                    userNum = Integer.parseInt(scanner.nextLine());
                } else if (randomNum > userNum) {
                    System.out.println("Higher!");
                    totalGuesses++;
                    userNum = Integer.parseInt(scanner.nextLine());
                }
            } while (randomNum != userNum);

            System.out.println("Good Guess!");

            if (totalGuesses == 1) {
                System.out.println("It took you 1 guess! Incredible!");
            } else {
                System.out.printf("It took you: %d guesses!%n", totalGuesses);
            }

            System.out.println("Play again? [Y/N]");
            playAgain = scanner.nextLine();
            totalGuesses = 0;

        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("Goodbye!");
    }

    public static int randomNumber100() {
        return (int) (Math.floor(Math.random() * 100) + 1);
    }
}
