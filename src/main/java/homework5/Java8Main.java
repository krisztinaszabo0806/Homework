package homework5;
import java.util.*;
import java.util.stream.Collectors;

import static homework5.Exponential.exponentialCalc;

public class Java8Main {

    public static void main(String... args) {

//Punctul 1) + Punctul 8) + Punctul 9)

        Person firstPerson = new Person("Maria", 18);
        Person secondPerson = new Person("Eva", 35);
        Person thirdPerson = new Person("Robert", 15);
        Person forthPerson = new Person("Mary", 3);
        Person fifthPerson = new Person("Michael", 56);


        List<Person> persons = new ArrayList<>();
        persons.add(firstPerson);
        persons.add(secondPerson);
        persons.add(thirdPerson);
        persons.add(forthPerson);
        persons.add(fifthPerson);

        Collections.sort(persons, new AgeComparator());

        System.out.println("These are the persons in ascending order by their age: ");

        persons.forEach(System.out::println);

        boolean isFound = persons.stream()
                .anyMatch(person -> person.getAge() > 18);

        System.out.println("Is there anybody over 18?");

        System.out.println(isFound);

        List<Person> adults = persons.stream()
                .filter(person -> person.getAge() >= 18)
                .collect(Collectors.toList());

        System.out.println("These are the persons over 18: ");

        adults.forEach(System.out::println);



//Punctul 2)

        Set<Person> newPersonsList = persons.stream()
                .filter(person -> person.getName().contains("a") && person.getName().startsWith("M"))
                .collect(Collectors.toSet());

        System.out.println("These are the persons of which name contains 'a' and starts with 'M': ");

        newPersonsList.forEach(System.out::println);

//Punctul 3)

        Person youngest = (Person) Collections.min(persons, new AgeComparator());
        System.out.println("This is the youngest person: " + youngest);

//Punctul 4) + Punctul 7)

        Set<String> randomStrings = new HashSet<>();
        Random random = new Random();
        for(int i=0;i<5;i++) {
            String generatedString = random.ints(60, 122)//(min value, max value)
                    .limit(10) //sets the string length to 10 characters
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            randomStrings.add(generatedString); //add the generatedString to the Set
        }
        System.out.println("These are the random Strings: ");
        randomStrings.forEach(System.out::println);

        List list = new ArrayList(randomStrings);
        Collections.sort(list, Collections.reverseOrder());
        Set resultSet = new LinkedHashSet(list);
        System.out.println("This is the max in the Random strings: " + resultSet.iterator().next());

        System.out.println("These are the Random strings in reverse order: ");

        list.forEach(System.out::println);


//Punctul 5)

        List<Integer> randomIntegers = new ArrayList<>();

        RandomInteger randomNumber = new RandomInteger();
        int randomNr = randomNumber.createRandomInteger();
        System.out.println("This is the number of the random integers from the list: " + randomNr);

        for (int i=1; i <= randomNr; i++){
            randomIntegers.add(randomNumber.createRandomInteger());
        }

        System.out.println("These are the random integers from the list: ");

        randomIntegers.forEach(System.out::println);

        List<Integer> exponentialList = new ArrayList<>();

        for (int i=0; i < randomNr; i++) {
            exponentialList.add(exponentialCalc(randomIntegers.get(i)));
        }

        System.out.println("This is the list of exponential numbers: ");

        exponentialList.forEach(System.out::println);

//Punctul 6)

        RandomInteger randomNumber2 = new RandomInteger();
        int randomNr2 = randomNumber2.createRandomInteger();
        System.out.println("This is the second random number: " + randomNr2);

        Map<Integer, Integer> randomMap = new HashMap<>();

        for (int i=1; i <= randomNr2; i++){
            randomMap.put(i, randomNumber2.createRandomInteger());
        }

        System.out.println("These are the elements of a random Map: ");

        randomMap.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

        System.out.println("This are the elements which has a value > 10: ");

        randomMap.entrySet().forEach(entry->{
            if (entry.getValue() > 10 ) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        });
    }
}
