import java.util.Scanner;

public class SumOfPreviousElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем размер массива
        System.out.print("Введите размер массива (2 или более): ");
        int size = scanner.nextInt();

        // Проверка на минимальный размер массива
        if (size < 2) {
            System.out.println("Размер массива должен быть 2 или более.");
            return; // Завершаем выполнение программы
        }

        // Создаем массив заданного размера
        int[] array = new int[size];

        // Считываем элементы массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Получаем массив логических значений
        boolean[] result = checkSumOfPrevious(array);

        // Выводим результат
        System.out.print("Результирующий массив логических значений: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", "); // Добавляем запятую между элементами
            }
        }
        System.out.println("]"); // Закрываем квадратные скобки

        scanner.close(); // Закрываем сканер
    }

    // Метод для проверки, является ли текущий элемент суммой двух предыдущих
    public static boolean[] checkSumOfPrevious(int[] array) {
        int size = array.length;
        boolean[] result = new boolean[size];

        // Заполняем логический массив
        for (int i = 2; i < size; i++) {
            result[i] = (array[i] == array[i - 1] + array[i - 2]);
        }

        return result; // Возвращаем массив логических значений
    }
}
