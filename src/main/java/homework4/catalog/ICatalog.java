package homework4.catalog;

import java.util.List;

public interface ICatalog {
    /**
     * Method addItem() adds a new sport item to the list of sport items.
     */
    void addItem(String category, String name, String brand, int price);

    /**
     * Method getAll() returns the list with the new items.
     */

    List<SportItem> getAll();

    /**
     * Method deleteItem(int index) removes the sport item with the specified index from the list.
     */

    void deleteItem(int index);

    /**
     * Method updatePrice(int index) is deprecated.
     */

    void updatePrice(int index);
}
