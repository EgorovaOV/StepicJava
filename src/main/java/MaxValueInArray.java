import java.util.Scanner;

public class MaxValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем размер массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        // Проверка на нулевой размер массива
        if (size <= 0) {
            System.out.println("Массив нулевого размера");
            return; // Завершаем выполнение программы
        }

        // Создаем массив заданного размера
        int[] array = new int[size];

        // Считываем элементы массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Ищем максимальное значение в массиве
        int max = array[0]; // Предполагаем, что первый элемент - максимальный
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i]; // Обновляем максимальное значение
            }
        }

        // Выводим максимальное значение
        System.out.println("Максимальное значение в массиве: " + max);

        scanner.close(); // Закрываем сканер
    }
}
