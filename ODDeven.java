import java.lang.*;
import java.util.*;

class OddNumberException extends Exception {
    public String toString() {
        return "odd number";
    }

}

public class CheckNumber {
    static void checkEven() {
        int num;
        if (num % 2 != 0)
            throw new OddNumberException("Number is odd");
        System.out.println("Number is even");
    }

    public static void main(String[] args) {
        try {
            checkEven(5);
        } catch (OddNumberException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
