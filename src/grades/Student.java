package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        int gradeAverage = sum / grades.size();
        return gradeAverage;
    }

    public static void main(String[] args) {

        // Test for new student object - does it output name and average?
        // Student kaleb = new Student("Kaleb");
        // kaleb.addGrade(100);
        // kaleb.addGrade(5);
        // kaleb.addGrade(23);
        // kaleb.addGrade(2000);
        // System.out.println("Name: " + kaleb.name);
        // System.out.println("Grade Average: " + kaleb.getGradeAverage());
    }
}
