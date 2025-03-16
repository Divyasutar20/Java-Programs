import java.util.*;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 1, 4, 2);
        Collections.sort(numbers);
        System.out.println("Sorted Numbers: " + numbers);
    }
}
