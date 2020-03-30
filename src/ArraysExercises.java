public class ArraysExercises {

    public static void main(String[] args) {

        // Q.1

        // int[] numbers = {1, 2, 3, 4, 5};
        // What will print below?
        // System.out.println(numbers);
        // A: it prints out it's address in memory - if you want specific data, gonna have to loop and target the element

        final int ARRAYS_PEOPLE = 3;

        Person[] friends = new Person[ARRAYS_PEOPLE];

        friends[0] = new Person("Aaron Lewis");
        friends[1] = new Person("Gale Dworsky");
        friends[2] = new Person("Dustin Lewis");

        for (int i = 0; i < friends.length; i++) {
            System.out.println(friends[i].getName());
        }

//        Person addition = new Person("Test Name");
//        friends friendsAndOne = addPerson(friends, addition);
//
//        for (Person friend : friendsAndOne) {
//            System.out.println(friend.getName());
//        }

    }

    public static Person[] addPerson(Person[] inputPeople, Person inputPerson) {
        Person[] newArray = new Person[inputPeople.length + 1];

        for(int i = 0; i < inputPeople.length; i++) {
            newArray[i] = inputPeople[i];

            newArray[newArray.length - 1] = inputPerson;

        }
            return newArray;
    }
}
