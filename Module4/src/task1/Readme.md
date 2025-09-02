# Task 2
**This is a about how i used the GitHub Copilot to complete code for example using Github copilot to write methods in a Calculator class that has the ability to sum positive integers. A negative integer should throw an exception.**

**Calculator Class with Sum Method**

```pythonpackage task1;

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
```
**Explanation how the  Calculator Class works**
The `Calculator` class is designed to perform basic arithmetic operations, specifically summing positive integers. It includes the following key components:
The calculator keeps track of an internal value, starting at zero.
The add(int number) method adds a positive integer to the value. If a negative number is provided, it throws a NegativeNumberException.
The reset() method sets the value back to zero.
The getValue() method returns the current value.
The main method demonstrates usage: it adds numbers, prints the result, resets the calculator, and prints the value again. 
If a negative number is added, the exception message is shown.