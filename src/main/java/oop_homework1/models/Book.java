package oop_homework1.models;

public class Book {


    public String name;

    public int numberOfPages;

    public Book() {

    }

    public Book(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages= numberOfPages;
    }

    public String toString() {
        return "The following book is in our library: " + name +", with number of pages: "+ numberOfPages;
    }


}
