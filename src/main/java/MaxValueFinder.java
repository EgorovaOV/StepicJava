import java.util.Scanner;

public class MaxValueFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE; // Инициализируем max минимально возможным значением
        int number;

        // Считываем значения до тех пор, пока не встретим 0
        while (true) {
            number = scanner.nextInt(); // Считываем следующее целое число

            if (number == 0) {
                break; // Выходим из цикла, если число равно 0
            }

            // Сравниваем текущее число с максимальным
            if (number > max) {
                max = number; // Обновляем максимальное значение
            }
        }

        // Выводим максимальное значение
        System.out.println("Максимальное значение: " + max);

        scanner.close(); // Закрываем сканер
    }
}
