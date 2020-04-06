package grades;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean userContinue = true;

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


        System.out.println("\nHere are our student's GitHub Usernames:\n");
        do {

            // Formatting to display GitHub usernames
            System.out.println("\n");
            for (String student : students.keySet()) {
                System.out.printf("|  %s  ", student);
            }
            System.out.print("|\n");
            System.out.println("\nWould you like to see individual or class data? [I/C]");
            String classOrPerson = scanner.next();


            if (classOrPerson.equalsIgnoreCase("i")) { // -----INDIVIDUAL DATA----- //
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
            } else if (classOrPerson.equalsIgnoreCase("c")) { // -----CLASS DATA----- //

                System.out.println("- - - - - Class Data - - - - -");
                int classGradeTotal = 0;
                int totalNumberOfStudents = 0;

                for (String student : students.keySet()) {
                    String studentName = students.get(student).getName();
                    ArrayList<Integer> studentGrades = students.get(student).getGrades();
                    classGradeTotal += students.get(student).getGradeAverage();
                    totalNumberOfStudents++;
                    System.out.printf("%nName: %s%nGrades: %s%n", studentName, studentGrades);
                }
                int classGradeAverage = classGradeTotal / totalNumberOfStudents;
                System.out.printf("%nClass Grade Average: %d%n", classGradeAverage);
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

        } while (userContinue);
        System.out.println("Goodbye.");
    }
}