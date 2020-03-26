public class Instructor {

    private String firstName;
    private String lastName;
    private int brainWaveFrequency;
    private static int numInstructors = 0;

    public Instructor(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        this.brainWaveFrequency = 0; //just a default
        numInstructors++; // counting number of total instructors

        System.out.printf("%s was just created.%n", firstName);
        System.out.printf("Instructor count: %d%n%n", numInstructors);
    }

    // Getter and Setter for First Name

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String first) {
        this.firstName = first;
    }

    // Getter and Setter for Last Name
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String last) {
        this.lastName = last;
    }

    // Getter and Setter for Brainwave Frequency
    public int getBrainWaveFrequency() {
        return brainWaveFrequency;
    }
    public void setBrainWaveFrequency(int brainWaveFreq) {
        this.brainWaveFrequency = brainWaveFreq;
    }

    // Method to display instructor info
    public String displayStats() {
        return String.format("\t%s %s, Brainwave Frequency = %d", firstName, lastName, brainWaveFrequency);
    }

}
