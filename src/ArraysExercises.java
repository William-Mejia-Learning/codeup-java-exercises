import java.util.Arrays;
import java.util.Scanner;

//1. Array Basics
public class ArraysExercises {

    public static Person[] addPerson(Person[] persons, Person n00b){
        Person[] newBiggerArray = new Person[persons.length + 1];
        for(int i = 0; i < persons.length; i++){
            newBiggerArray[i] = persons[i];
        }
        newBiggerArray[newBiggerArray.length -1] = n00b;
        return newBiggerArray;
    }

    public static Person[] addPersonWithCopyOf(Person[] persons, Person n00b){
        Person[] newPersonArray;
        newPersonArray = Arrays.copyOf(persons, persons.length + 1);
        newPersonArray[newPersonArray.length -1] = n00b;
        return newPersonArray;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//
        String name4 = sc.nextLine();

        Person person1 = new Person("Carlos");
        Person person2 = new Person("Daniel");
        Person person3 = new Person("John");
        Person person4 = new Person(name4);
//        Person person5 = new Person("name");

        Person[] personArr = {person1, person2, person3};

//        for(Person person : personArr){
//            System.out.println(person.getName());
//        }

        Person[] newPersonsArray = ArraysExercises.addPerson(personArr, new Person(name4));

//        System.out.println(Arrays.toString(newPersonsArray));


//        Person[] newPersonsArray = ArraysExercises.addPersonWithCopyOf(personArr, new Person("Jay"));
//        for(Person person: newPersonsArray){
//            person.sayHello();
//        }
//        for(Person person : newPersonsArray){
//            System.out.println(person.getName());
//
//        }

        Person[] newPersonsArray1 = ArraysExercises.addPerson(newPersonsArray, new Person("jay"));

        for (Person person: newPersonsArray1){
            System.out.println(person.getName());
        }

    }
}
