package homework4.catalog;

import homework4.fibonacci.ValidationException;

import java.io.*;
import java.util.List;
import java.io.IOException;

public class CatalogMain {

    public static void main(String... args) {

        BufferedReader bufferedReader;

        try {
            Reader reader = new FileReader("catalog.csv");

            SportItemCSVParser sportItemCSVParser = new SportItemCSVParser();

            List<SportItem> itemList = sportItemCSVParser.readFromFile(reader);

            ICatalog catalogService = new CatalogServiceImpl();
            catalogService.addItem("Swimming", "goggles", "Active", 13);
            catalogService.addItem("Dancing", "shirt", "Puma", 150);

            List<SportItem> itemListWithNewItems = catalogService.getAll();

            catalogService.deleteItem(1);

            itemList.addAll(itemListWithNewItems);

            System.out.println(itemList.size());

            itemList.forEach(System.out::println);

            SportItem sportItem = itemList.get(3);

            System.out.println("WHAT WE SEND: " + sportItem);

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("serialization.object"));
            objectOutputStream.writeObject(sportItem);
            objectOutputStream.flush();
            objectOutputStream.close();

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("serialization.object"));
            Object objectValue = objectInputStream.readObject();
            SportItem sportItemDeserialized = (SportItem) objectValue;
            System.out.println("WHAT WE RECEIVE: " + sportItemDeserialized);
            objectInputStream.close();

        }catch (IOException | ClassNotFoundException | ValidationException e) {
            System.out.println(e.getMessage());
        }


    }
}
