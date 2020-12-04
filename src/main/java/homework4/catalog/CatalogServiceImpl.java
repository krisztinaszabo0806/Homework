package homework4.catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogServiceImpl implements ICatalog {

    private List<SportItem> items = new ArrayList<>();

    @Override
    public void addItem(String category, String name, String brand, int price) {
        SportItem sportItem = new SportItem(category, name, brand, price);
        items.add(sportItem);
    }

    @Override
    public List<SportItem> getAll() {
        return items;
    }

    @Override
    public void deleteItem(int index) {
        items.remove(index);

    }

    @Deprecated
    public void updatePrice(int index) {
    }


}
