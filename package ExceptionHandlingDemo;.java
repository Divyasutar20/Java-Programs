package ExceptionHandlingDemo;

class DivisionException extends Exception {
    DivisionException(String msg) {
        super(msg);
    }
}

class Calculator {
    int divide(int a, int b) throws DivisionException {
        if (b == 0)
            throw new DivisionException("Cannot divide by zero.");
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            int result = calc.divide(10, 0); // change to non-zero to avoid exception
            System.out.println("Result: " + result);
        } catch (DivisionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
