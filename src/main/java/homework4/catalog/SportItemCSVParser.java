package homework4.catalog;

import homework4.fibonacci.ValidationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class SportItemCSVParser {
    public List<SportItem> readFromFile(Reader reader) throws IOException, ValidationException {

        List<SportItem> items = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(reader);

        String line = bufferedReader.readLine();

        while (line != null) {
            String[] tokens = line.split(",");

            if (tokens.length != 4) {
                throw new ValidationException("Please check your input file, because it is not consistent and it cannot be processed!");
            }

            SportItem sportItem = new SportItem(tokens[0], tokens[1], tokens[2], Integer.parseInt(tokens[3]));

            items.add(sportItem);

            line = bufferedReader.readLine();
        }

        return items;

    }
}
