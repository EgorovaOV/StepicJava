import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем размер массива
        System.out.print("Введите размер массива (больше 0): ");
        int size = scanner.nextInt();

        // Проверка на положительный размер массива
        if (size <= 0) {
            System.out.println("Размер массива должен быть больше 0.");
            return; // Завершаем выполнение программы
        }

        // Создаем массив заданного размера
        int[] array = new int[size];

        // Считываем элементы массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Вычисляем сумму четных чисел
        int sumOfEvens = 0;
        for (int num : array) {
            if (num % 2 == 0) { // Проверяем, является ли число четным
                sumOfEvens += num; // Добавляем к сумме
            }
        }

        // Выводим результат
        System.out.println("Сумма четных чисел: " + sumOfEvens);

        scanner.close(); // Закрываем сканер
    }
}
