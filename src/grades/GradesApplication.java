package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean userContinue = true;
        int counter = 0;

        HashMap<String, Student> students = new HashMap<>();

        Student johnjacobs = new Student("John Jacobs");
        johnjacobs.addGrade(100);
        johnjacobs.addGrade(95);
        johnjacobs.addGrade(98);

        Student kelly = new Student("Kelly");
        kelly.addGrade(100);
        kelly.addGrade(100);
        kelly.addGrade(97);

        Student chester = new Student("Chester");
        chester.addGrade(55);
        chester.addGrade(65);
        chester.addGrade(85);

        Student evie = new Student("Evie");
        evie.addGrade(75);
        evie.addGrade(82);
        evie.addGrade(86);

        students.put("Tiny Dancer", johnjacobs);
        students.put("WilE", kelly);
        students.put("Chester88", chester);
        students.put("EvelynM", evie);

        // Begin Program
        System.out.println("\nHere are our student's GitHub Usernames:\n");

        //Formatting to display GitHub usernames
        for (String student : students.keySet()) {
            System.out.printf("|  %s  ", student);
        }
        System.out.print("|\n");


        do {
            System.out.println("\nWould you like to see individual or class data? [I/C]");
            String classOrPerson = scanner.next();

            // INDIVIDUAL DATA
            if (classOrPerson.equalsIgnoreCase("i")) {
                System.out.println("\nWhich student would you like to see more about?");
                scanner.nextLine();
                String userSelection = scanner.nextLine();

                if (students.get(userSelection) == null) {
                    System.out.println("\nSorry, no student found with that username.");
                    System.out.println("Would you like to go again? [Y/N]");

                    String userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("n")) {
                        userContinue = false;
                    }
                } else {
                    System.out.println("\n- - - - - - - - - - -");
                    System.out.printf("Name: %s%nGitHub Username: %s%nGrades: %s%nGrade Average: %.2f",
                            students.get(userSelection).getName(),
                            userSelection,
                            students.get(userSelection).getGrades(),
                            students.get(userSelection).getGradeAverage());
                    System.out.println("\n- - - - - - - - - - -");
                    System.out.println("\nWould you like to go again? [Y/N]");

                    String userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("n")) {
                        userContinue = false;
                    }
                }
            }

            // CLASS DATA
            else if (classOrPerson.equalsIgnoreCase("c")) {

                System.out.println("- - - - - Class Grades - - - - -");
                for (String student : students.keySet()) {
                    System.out.printf("%nName: %s%nGrades: %s%n", students.get(student).getName(), students.get(student).getGrades());
                }
                System.out.println("- - - - - - - - - - - - - - - -");
                System.out.println("\nWould you like to go again? [Y/N]");

                scanner.nextLine();
                String userInput = scanner.nextLine();
                if (userInput.equalsIgnoreCase("n")) {
                    userContinue = false;
                }
            } else {
                System.out.print("\nInvalid entry. Please try again.");
            }

        }
            while (userContinue) ;
            System.out.println("Goodbye.");
        }
    }