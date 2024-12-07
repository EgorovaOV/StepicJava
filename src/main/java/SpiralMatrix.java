import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем размеры двумерного массива
        System.out.print("Введите размеры массива (строки и столбцы): ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // Создаем двумерный массив
        int[][] matrix = new int[rows][cols];

        // Заполняем массив по спирали
        fillSpiral(matrix, rows, cols);

        // Выводим массив
        printMatrix(matrix);

        scanner.close(); // Закрываем сканер
    }

    // Метод для заполнения массива по спирали
    private static void fillSpiral(int[][] matrix, int rows, int cols) {
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;
        int num = 1;

        while (top <= bottom && left <= right) {
            // Заполняем верхнюю строку
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // Заполняем правый столбец
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            if (top <= bottom) {
                // Заполняем нижнюю строку
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            if (left <= right) {
                // Заполняем левый столбец
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }
    }

    // Метод для вывода массива в консоль
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println(); // Переход на новую строку после каждой строки массива
        }
    }
}

