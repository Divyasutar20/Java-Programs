import java.util.*;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] result = new int[2][2];
        System.out.println("Enter elements of first 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter elements of second 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Choose operation: \n1. Addition \n2. Multiplication \n3. Transpose (First Matrix)");
        int choice = scanner.nextInt();
        scanner.close();
        switch (choice) {
            case 1:
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = matrix1[i][j] + matrix2[i][j];
                    }
                }
                System.out.println("Result of Addition:");
                break;
            case 2:
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = 0;
                        for (int k = 0; k < 2; k++) {
                            result[i][j] += matrix1[i][k] * matrix2[k][j];
                        }
                    }
                }
                System.out.println("Result of Multiplication:");
                break;
            case 3:
                System.out.println("Transpose of First Matrix:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(matrix1[j][i] + " ");
                    }
                    System.out.println();
                }
                return;
            default:
                System.out.println("Invalid choice");
                return;
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
