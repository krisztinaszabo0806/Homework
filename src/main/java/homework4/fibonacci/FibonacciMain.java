package homework4.fibonacci;

import static homework4.fibonacci.FibonacciCalc.fibonacciRecursion;

public class FibonacciMain {


    private static int parseNumber(String number) throws ValidationException {
        int value;
        try {
            value = Integer.parseInt(number);
        }catch (NumberFormatException e){
            throw new ValidationException("the value you entered should be an integer!");
        }
        if (value < 0) {
            throw new ValidationException("the value should be positive!");
        }
        return value;
    }

    public static void main(String... args) {
        try {
            int number = parseNumber("10");
            System.out.print("Fibonacci Series of "+number+" numbers: ");
            for(int i = 0; i <= number; i++){
                System.out.print(fibonacciRecursion(i) +" ");
            }
        }catch (ValidationException e) {
            System.out.println("Invalid number argument: " + e.getMessage());
        }
    }

}
