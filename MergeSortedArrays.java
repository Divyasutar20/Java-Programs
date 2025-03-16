import java.util.*;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of first sorted array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " sorted numbers:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nexInt();
        }
        System.out.print("Enter size of second sorted array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " sorted numbers:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        scanner.close();
        int[] mergedArray = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }
        while (i < n1) {
            mergedArray[k++] = arr1[i++];
        }
        while (j < n2) {
            mergedArray[k++] = arr2[j++];
        }
        System.out.println("Merged sorted array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}
