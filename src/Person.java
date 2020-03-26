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
        System.out.printf("Hello %s%n", this.name);
    }

    // constructor
    public Person(String passedName) {
        this.name = passedName;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Kaleb Daniel");
        System.out.println("p1.name = " + p1.name);
        p1.getName();
        p1.sayHello();

        p1.setName("Test");
        System.out.println("p1.name = " + p1.name);
        p1.getName();
        p1.sayHello();

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