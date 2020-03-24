import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String confirmation = "Y";

        while (confirmation.equalsIgnoreCase("y")) {
            System.out.print("Talk with Bob: ");
            String userInput = input.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("")) {
                System.out.println("Fine Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.print("Continue? [Y/N]");
            confirmation = input.next();
            input.nextLine();
        }
        System.out.println("Goodbye");
    }
}
