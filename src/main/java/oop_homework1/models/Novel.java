package oop_homework1.models;

public class Novel extends Book {


    private String type;

    private Author author;

    public Novel(String name, int numberOfPages, String type) {
        this.type = type;
        super.name = name;
        super.numberOfPages = numberOfPages;
    }


}
