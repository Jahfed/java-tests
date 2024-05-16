
import java.util.Scanner;

public class MatrixRotations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please, enter matrix size: ");
        int size = in.nextInt();
        double[][] matrix = generateMatrix(size);

        System.out.println("How you want to rotate matrix:" + System.lineSeparator() +
                "\t1 - 90" + System.lineSeparator() +
                "\t2 - 180" + System.lineSeparator() +
                "\t3 - 270");
        int mode = in.nextInt();

        System.out.println(System.lineSeparator() + "Base matrix:" + System.lineSeparator());
        printMatrixToConsole(matrix);
        System.out.println();

        if (rotateMatrix(matrix, mode)) {
            printMatrixToConsole(matrix);
        }
        in.close();
    }

    private static double[][] generateMatrix(int size) {
        double[][] matrix = new double[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = Double.valueOf(Integer.toString(i) + "."
                        + Integer.toString(j));
            }
        }
        return matrix;
    }

    private static void printMatrixToConsole(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static boolean rotateMatrix(double[][] matrix, int mode) {
        switch (mode) {
            case 1:
                System.out.println("90 degrees rotated:" + System.lineSeparator());
                rotate90(matrix);
                break;
            case 2:
                System.out.println("180 degrees rotated:" + System.lineSeparator());
                rotate180(matrix);
                break;
            case 3:
                System.out.println("270 degrees rotated:" + System.lineSeparator());
                rotate270(matrix);
                break;
            default:
                System.out.println("You selected non-existing mode!");
                return false;
        }
        return true;
    }

    public static void rotate90(double[][] matrix) {

        double[][] rotated90 = rotatePer90(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = rotated90[i][j];
            }
        }
    }

    public static void rotate180(double[][] matrix) {
        double[][] rotated180 = rotatePer90(rotatePer90(matrix));

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = rotated180[i][j];
            }
        }
    }

    public static void rotate270(double[][] matrix) {
        double[][] rotated270 = rotatePer90(rotatePer90(rotatePer90(matrix)));

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = rotated270[i][j];
            }
        }
    }

    private static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposedMatrix = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    private static double[][] rotatePer90(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] rotated = new double[cols][rows];

        rotated = transposeMatrix(matrix);
        for (int i = 0; i < rows; i++) {
            double[] currentRow = rotated[i];
            rotated[i] = reverseRow(currentRow);

        }

        return rotated;
    }

    private static double[] reverseRow(double[] row) {
        int n = row.length;
        for (int j = 0; j < n / 2; j++) {
            double temp = row[j];
            row[j] = row[n - j - 1];
            row[n - j - 1] = temp;
        }
        return row;
    }

}
