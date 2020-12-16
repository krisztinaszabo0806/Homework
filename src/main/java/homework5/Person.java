package homework5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Person {
    @Getter
    private String name;
    @Getter
    private int age;
}
