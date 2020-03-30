public class Person {

    private String name;

    // returns the person's name
    public String getName() {
        return name;
    }

    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello " + name + ".");
    }

    // constructor
    public Person(String name) {
        setName(name);
    }

    public static void main(String[] args) {
        Person kaleb = new Person("Kaleb Daniel");
        System.out.println("kaleb.name = " + kaleb.name);
        kaleb.getName(); // doesn't actually print/do anything with a return - looks like getter's are mostly used to do comparisons or checks
        kaleb.sayHello();

        kaleb.setName("Test");
        System.out.println("new-name-after-setting.name = " + kaleb.name);
        kaleb.sayHello();

        // Q.2
        // Person person1 = new Person("John");
        // Person person2 = new Person("John");
        // Below is true - values of the 2 reference points are the same
        // System.out.println("\n"+person1.getName().equals(person2.getName()));
        // Below is false - although the 2 people share the same name value, they are stored in different places in memory
        // == only works on primitive, not reference
        // System.out.println(person1 == person2);

        // Person person1 = new Person("John");
        // Person person2 = person1;
        // Below is true - person2 equals person1, meaning both are referencing the         same point in memory
        // System.out.println(person1 == person2);

        // Person person1 = new Person("John");
        // Person person2 = person1;
        // System.out.println(person1.getName());
        // System.out.println(person2.getName());
        // person2.setName("Jane");
        // System.out.println(person1.getName());
        // System.out.println(person2.getName());
        // Prints John John Jane Jane (thought it'd be 3 John's and 1 Jane) Once you        set person2's name it changes the value it's referencing, hence why person1        also becomes Jane
    }

}