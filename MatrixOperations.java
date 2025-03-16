import java.util.*;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] sum = new int[3][3];
        int[][] diff = new int[3][3];
        int[][] prod = new int[3][3];

        System.out.println("Enter elements of 3x3 matrix A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of 3x3 matrix B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = A[i][j] + B[i][j];
                diff[i][j] = A[i][j] - B[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                prod[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    prod[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("\nMatrix Addition:");
        printMatrix(sum);

        System.out.println("\nMatrix Subtraction:");
        printMatrix(diff);

        System.out.println("\nMatrix Multiplication:");
        printMatrix(prod);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
