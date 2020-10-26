package main_classes;

import java.util.ArrayList;
import java.util.List;

public class ListBooks {
    static void main(String... arg) {
        Novel firstNovel = new Novel();
        Novel secondNovel = new Novel();
        Album firstAlbum = new Album();

    }

    List<Book> books = new ArrayList<>();
        books.add(firstNovel);
        books.add(secondNovel);
        books.add(firstAlbum);

        for (Book book : books) {

    }
}
