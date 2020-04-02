public class Person {

    private String name;

    // Constructor
    public Person(String constructorName) {
        this.name = constructorName;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Method for saying hello
    public void sayHello() {
        System.out.println("Hello "+name+"!");
    }

    public static void main (String[] args) {

        // Q.1
        // Creating a new person object
        Person kaleb = new Person("Kaleb Dworsky");
        // Using the getName and sayHello method on the Person object stored in the variable 'kaleb'
        System.out.println("\nThis newly created person is: " + kaleb.getName());
        kaleb.sayHello();
        // Calling the variable 'kaleb' shows it's location in memory in hex form
        System.out.println(kaleb);


        // Testing what happens when setting a value on a created object
        System.out.println("\n");
        kaleb.setName("Cameron Walker");
        // Location in memory stays the same - doesn't create a new object
        System.out.println(kaleb);
        System.out.println("After setting a name on an already created object, my new name is: " + kaleb.getName());
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
        // Below is true - person2 equals person1, meaning both are referencing the same point in memory
        // System.out.println(person1 == person2);

        // Person person1 = new Person("John");
        // Person person2 = person1;
        // System.out.println(person1.getName());
        // System.out.println(person2.getName());
        // person2.setName("Jane");
        // System.out.println(person1.getName());
        // System.out.println(person2.getName());
        // Prints John John Jane Jane (thought it'd be 3 John's and 1 Jane) Once you set person2's name it changes the value it's referencing, hence why person1 also becomes Jane
    }
}