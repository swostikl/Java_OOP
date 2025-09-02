package task1;
// write a calculator class to sum positive numbers and throw an exception if any number is negative

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Calculator {
    private int value = 0;

    public void reset() {
        value = 0;
    }

    public void add(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed: " + number);
        }
        value += number;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            calc.add(5);
            calc.add(10);
            calc.add(3);
            System.out.println("Current value: " + calc.getValue());
            calc.reset();
            System.out.println("Value after reset: " + calc.getValue());
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}