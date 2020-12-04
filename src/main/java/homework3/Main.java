package homework3;

import java.util.*;

public class Main {

    public static void main(String... args) {

        Person firstPerson = new Person("Alexa", 22);
        Person secondPerson = new Person("Rob", 35);
        Person thirdPerson = new Person("Mary", 15);

        Set<Person> nameComp = new TreeSet<Person>(new NameComparator());
        nameComp.add(firstPerson);
        nameComp.add(secondPerson);
        nameComp.add(thirdPerson);
        for (Person person : nameComp) {
            System.out.println(person);
        }
        System.out.println("===========================");
        Set<Person> ageComp = new TreeSet<Person>(new AgeComparator());
        ageComp.add(firstPerson);
        ageComp.add(secondPerson);
        ageComp.add(thirdPerson);
        for (Person person : ageComp) {
            System.out.println(person);
        }


        Country firstAddress = Country.ROMANIA;
        Country secondAddress = Country.BELGIUM;
        Country thirdAddress = Country.FRANCE;

        Hobby firstHobby = new Hobby("Swimming", 2);

        firstHobby.addCountry(firstAddress);
        firstHobby.addCountry(secondAddress);


        System.out.println("===========================");


        Hobby secondHobby = new Hobby("Cycling", 5);

        secondHobby.addCountry(secondAddress);
        secondHobby.addCountry(thirdAddress);

        Map<Person, List<Hobby>> personMap = new HashMap<>();

        firstPerson.addHobby(firstHobby);

        firstPerson.addHobby(secondHobby);

        personMap.put(firstPerson, firstPerson.hobbyList);

        for (Map.Entry<Person, List<Hobby>> entry : personMap.entrySet()) {

            System.out.println("This person: " + entry.getKey() + " and has the following hobbies: " + entry.getValue());

            List<Country> entryList = new ArrayList<>();
            entryList.addAll(firstHobby.countryList);
            entryList.addAll(secondHobby.countryList);
            System.out.println("These hobbies can be practiced in: ");


            for (int i = 0; i < entryList.size(); i++) {
                System.out.println(entryList.get(i));
            }


        }


    }

}
