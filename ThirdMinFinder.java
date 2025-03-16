import java.util.*;

public class ThirdMinFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // Sort the array in ascending order

        System.out.println("Third Minimum Number: " + arr[2]); // 3rd minimum is at index 2
        sc.close
