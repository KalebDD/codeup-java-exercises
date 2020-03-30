import java.util.Random;

public class ServerNameGenerator {

//    Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
    public static String[] adjectives = {"loud", "silly"};
    public static String[] nouns = {"dog", "cat"};
//    Create a method that will return a random element from an array of strings.
    public static String getWord(String[] choices) {
        Random random = new Random();
        String randWord = choices[random.nextInt(choices.length)];

        return randWord;
    }
//    Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
    public static void main(String[] args) {
        System.out.println("\t" + getWord(adjectives) + "-" + getWord(nouns));
    }
}
