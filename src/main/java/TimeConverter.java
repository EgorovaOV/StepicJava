import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSeconds = scanner.nextInt(); // Получаем количество секунд

        // Вычисляем часы, минуты и секунды
        int hours = totalSeconds / 3600; // Часы
        int minutes = (totalSeconds % 3600) / 60; // Минуты
        int seconds = totalSeconds % 60; // Секунды

        // Форматируем вывод
        System.out.printf("%d:%02d:%02d\n", hours, minutes, seconds);
    }
}
