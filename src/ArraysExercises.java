import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

//        exercise example 1
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);


//        create person array
        Person[] people = new Person[3];

        people[0] = new Person("travis");
        people[1] = new Person("mike");
        people[2] = new Person("james");

        Person newPerson = new Person("alfred");
        Person person5 = new Person("amanda");
        addPerson(people, newPerson);
        addPerson(people, person5);

        for (Person person : addPerson(people, newPerson)) {
            System.out.println(person.getName());
        }


    }

    public static Person[] addPerson(Person[] people, Person person) {
        Person[] newPeople;
        newPeople = Arrays.copyOf(people, (people.length + 1));
        newPeople[newPeople.length - 1] = person;
        return newPeople;
    }
}

