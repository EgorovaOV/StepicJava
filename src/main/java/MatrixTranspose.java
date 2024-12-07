import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем размеры матрицы
        System.out.print("Введите количество строк и столбцов матрицы: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // Создаем матрицу заданного размера
        int[][] matrix = new int[rows][cols];

        // Считываем элементы матрицы
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Транспонируем матрицу
        int[][] transposedMatrix = transpose(matrix, rows, cols);

        // Выводим транспонированную матрицу
        System.out.println("Транспонированная матрица:");
        printMatrix(transposedMatrix);

        scanner.close(); // Закрываем сканер
    }

    // Метод для транспонирования матрицы
    private static int[][] transpose(int[][] matrix, int rows, int cols) {
        int[][] transposed = new int[cols][rows]; // Создаем новую матрицу для транспонирования

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j]; // Переносим элементы по главной диагонали
            }
        }

        return transposed; // Возвращаем транспонированную матрицу
    }

        // Метод для вывода матрицы в консоль без лишних пробелов в конце строк
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            StringBuilder rowOutput = new StringBuilder(); // Используем StringBuilder для формирования строки
            for (int value : row) {
                rowOutput.append(value).append(" "); // Добавляем значение и пробел
            }
            // Удаляем последний пробел и выводим строку
            System.out.println(rowOutput.toString().trim());
        }
    }
}
