package homework3;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int age;
    private Hobby hobby;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(){

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return "Name: " + this.name + " is " + this.age + " years old";
    }

    List<Hobby> hobbyList = new ArrayList<>();
    public void addHobby(Hobby hobby) {
        this.hobby = hobby;
        this.hobbyList.add(this.hobby);

    }




}
