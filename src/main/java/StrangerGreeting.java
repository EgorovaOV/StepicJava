import java.util.Scanner;

public class StrangerGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStrangers =-1; // Инициализируем с отрицательного значения для проверки

        // Запрашиваем количество незнакомцев
        while (true) {
            System.out.print("Введите количество незнакомцев: ");
            String input = scanner.nextLine(); // Считываем ввод как строку

            // Проверяем, является ли введенная строка целым числом
            if (!input.matches("-?\\d+")) {
                System.out.println("Ошибка: Введите корректное целое число.");
                continue; // Продолжаем цикл, запрашивая ввод снова
            }


            // Преобразуем строку в целое число
        numberOfStrangers = Integer.parseInt(input);

        // Обрабатываем различные случаи
            if (numberOfStrangers < 0) {
                System.out.println("Серьезно? А что так негативно?");
                return; // Завершаем выполнение программы при отрицательном числе
            } else if (numberOfStrangers == 0) {
                System.out.println("Оу... Похоже здесь никого...");
                return; // Завершаем выполнение программы, если незнакомцев нет
            } else {
                break; // Выходим из цикла, если количество незнакомцев положительное
            }
        }

            // Если есть незнакомцы, считываем их имена
        System.out.print("Введите имена незнакомцев через пробел: ");
        String names = scanner.nextLine();
        String[] strangers = names.split(" "); // Разделяем имена по пробелам

        // Выводим приветствие для каждого незнакомца
        for (String name : strangers) {
            System.out.println("Привет, " + name);
        }

        scanner.close(); // Закрываем сканер
    }}
