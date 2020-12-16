package homework5;

import java.util.Random;

public class RandomInteger {


    public int createRandomInteger() {

        Random rand = new Random();

        int upperBound = 14;

        int intRandom = rand.nextInt(upperBound);

       return intRandom;
    }
}
