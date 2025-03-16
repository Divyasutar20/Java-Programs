import java.util.*;

public class SecondMinFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        int secondMin = arr[0];
        for (int i = 1; i < 5; i++) {
            if (arr[i] > arr[0]) {
                secondMin = arr[i];
                break;
            }
        }
        System.out.println("Second Minimum Element: " + secondMin);
    }
}
