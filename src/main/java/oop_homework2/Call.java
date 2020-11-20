package oop_homework2;

public class Call {

    private String number;

    public Call(String number){
        this.number = number;
    }

    public String toString() {
        return "You have called the following number: " + number;
    }
}
