package homework3;

import java.util.ArrayList;
import java.util.List;

public class Hobby {

    private String name;
    private int frequency;
    private Country country;

    public Hobby(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    List<Country> countryList = new ArrayList<>();


    public void addCountry(Country country) {
        this.country = country;
        this.countryList.add(this.country);

    }


    public String toString() {
        return "Name: " + this.name;
    }


}
