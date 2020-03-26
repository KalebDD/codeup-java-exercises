import java.util.Arrays;
import java.util.Random;

public class ArrayLec {
    // Let's have some fun with arrays!

    public static void main(String[] args) {

        /* ***************   ******** ********************* */
        /* ******** WORKING WITH ARRAY ELEMENTS *********** */
        /* ************* ITERATING ARRAYS ***************** */
        /* ***************   ******** ********************* */

        // TODO: 1. Declare an int array called numbers without populating it
        int[] numbers;
        //       2. Declare a String array called words with a length of 10
        String[] words = new String[10];
        //       3. Initialize an int array called temps with the 'array initializer syntax'
        int[] temps = {34, 31, 23, 34, 56}; //temps.length = 5


        // TODO: 1. Using a for loop, iterate through the temps array and print each temp on a new line
        for (var i = 0; i < temps.length; i++) {
            System.out.println(temps[i]);
        }
        //       2. Using an advanced for, iterate through the temps array and print each temp on a new line
        for (int temp : temps) {
            System.out.println(temp);
        }
        //       3. Re-assign the third element with a temp of 38
        temps[2] = 38;
        //       4. Print "Updated third temp: 38" to the console, using printf
        System.out.printf("Updated third temp: %d%n", temps[2]);


        // TODO: 1. Create a string called 'horns', populated with 4 values, using array initializer syntax
        String[] horns = {"Yamaha", "Conn", "Schmid", "Holton"};
        //       2. Print a random element to the screen, saying "_random_ is the best manufacturer!"
        Random rand = new Random();
        int randInt = rand.nextInt(horns.length);
        System.out.println(horns[randInt] + " is the best manufacturer!");




        /* ***************   ******** ********************* */
        /* ********* **** THE ARRAYS CLASS **** *********** */
        /* **************** 2D ARRAYS ********************* */
        /* ***************   ******** ********************* */

        // TODO: 1. Create an 'Instructor' class that stores an instructor's
        //           -- firstName
        //           -- lastName
        //           -- brainWaveFrequency
        //        -- Also, keep a count of the total number of instructors

        //       2. Print to the console when an instructor has been created
        //       3. Create Getters and Setters for names / brainwavefreq
        //       4. Create a method to display instructor stats
        //       5. Initialize an array full of instructor objects
        //       6. Instantiate three instructors (casey,vivian,trant)
        //       7. Set each instructor's BrainWaveFrequency
        //       8. Add those instructors in the Instructor object array
        //       9. Iterate through the Instructor object array, and display each instructor's stats
        //       10. Create an array with only first names in it, and display it to the console
        //       11. Sum the brainwave frequencies, and display the total to the console
        //       12. Sum the brainwave frequencies, and display the total to the console
        //       13. Create a 2D array, and print it to the console, in grid form

        // define number of class instructors
        final int FORTUNA_TEAM = 3;

        //assign a length to an array to hold the instructor team
        Instructor[] team = new Instructor[FORTUNA_TEAM];



        // we now have an array with a length of 4, that holds instructor object

        //create each instructor object we'll be putting in our array
        Instructor casey = new Instructor("Casey", "Friday");

        //create each instructor object
        Instructor vivian = new Instructor("Vivian", "Canales");
        Instructor trant = new Instructor("Trant", "Batey");

        // Set instructor Brainwave Frequencies
        casey.setBrainWaveFrequency(55000);
        vivian.setBrainWaveFrequency(58000);
        trant.setBrainWaveFrequency(65000);

        // put instructors in an array
        team[0] = casey;
        team[1] = vivian;
        team[2] = trant;

        // now, our team array has 3 instructor objects inside of it

        // Iterate through each instructor, and display their stats
        for (Instructor instructor : team) {
            System.out.println(instructor.displayStats());
        }
        System.out.println(); // add extra line

        // Create an array with only first names of instructors
        String[] firstNames = new String[FORTUNA_TEAM];

        for (int i = 0; i < team.length; i++) {
            firstNames[i] = team[i].getFirstName();
        }

        for (String firstName : firstNames) {
            System.out.println(firstName);
        }

        // Overwrite all the elements in the firstNames array to 'haXX0rz'
        Arrays.fill(firstNames, "haXX0rz"); // should contain haXX0rz, haXX0rz haXX0rz
        for (String name : firstNames) {
            System.out.println(name);
        }
        System.out.println(Arrays.toString(team));

        //sum up all of the instructor frequencies
        int fregSum = 0;

        for(Instructor instructor : team) {
            fregSum += instructor.getBrainWaveFrequency();
        }
        System.out.printf("\tTotal Brainpower: %d, MHz\n", fregSum / 1000);

    }
}