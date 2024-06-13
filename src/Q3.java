import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[][] matrix1 = new int[size][size];
        int[][] matrix2 = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        int[][] sum = addMatrices(matrix1, matrix2);
        printMatrix(sum);
        int[][] difference = subtractMatrices(matrix1, matrix2);
        printMatrix(difference);
        int[][] product = multiplyMatrices(matrix1, matrix2);
        printMatrix(product);

    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int size = matrix1.length;
        int[][] sum = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return sum;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int size = matrix1.length;
        int[][] difference = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                difference[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return difference;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int size = matrix1.length;
        int[][] product = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return product;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}