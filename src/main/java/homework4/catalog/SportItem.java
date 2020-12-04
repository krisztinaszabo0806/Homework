package homework4.catalog;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@ToString
public class SportItem implements Serializable {

    @Getter
    private  String category;
    private String name;
    private String brand;
    private int price;


}
