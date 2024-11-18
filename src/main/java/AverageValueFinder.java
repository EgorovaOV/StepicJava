import java.util.Scanner;

public class AverageValueFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0; // Сумма всех введенных значений
        int count = 0; // Количество введенных значений
        int number;

        // Считываем значения до тех пор, пока не встретим 0
        while (true) {
            number = scanner.nextInt(); // Считываем следующее целое число

            if (number == 0) {
                break; // Выходим из цикла, если число равно 0
            }

            sum += number; // Добавляем текущее число к сумме
            count++; // Увеличиваем счетчик введенных чисел
        }

        // Вычисляем среднее значение (целочисленное деление)
        int average = sum / count;

        // Выводим среднее значение
        System.out.println("Среднее значение: " + average);

        scanner.close(); // Закрываем сканер
    }
}
