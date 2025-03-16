import java.util.*;

public class CubeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Cubes of the entered numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Cube of " + numbers[i] + " is " + (numbers[i] * numbers[i] * numbers[i]));
        }

        sc.close();
    }
}
