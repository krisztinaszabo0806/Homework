package homework5;
import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2){
        if(person1.getAge() > person2.getAge()){
            return 1;
        } else {
            return -1;
        }
    }

}
