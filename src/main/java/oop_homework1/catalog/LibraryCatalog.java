package oop_homework1.catalog;

import oop_homework1.models.ArtAlbum;
import oop_homework1.models.Book;
import oop_homework1.models.Novel;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {

    public static void main(String... args) {


        Book firstBook = new Novel("Titanic", 350, "mystery");
        Book secondBook = new ArtAlbum("New Zealand", 150, "Premium");
        Novel thirdBook = new Novel("Universe", 120, "sf");
        ArtAlbum forthBook = new ArtAlbum("Africa", 220, "Good");


        List<Book> books = new ArrayList<>();
        books.add(firstBook);
        books.add(secondBook);
        books.add(thirdBook);
        books.add(forthBook);

        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }

    }
}
