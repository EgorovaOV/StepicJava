import java.util.Scanner;

public class SnailClimb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем входные данные
        int a = scanner.nextInt(); // Подъем за день
        int b = scanner.nextInt(); // Сползание за ночь
        int h = scanner.nextInt(); // Высота дерева

        // Проверяем, может ли улитка вообще достичь вершины
        if (a <= b && h > a) {
            System.out.println("Никогда");
            return;
        }

        int days = 0; // Счетчик дней
        int currentHeight = 0; // Текущая высота улитки

        // Цикл, который продолжается, пока улитка не достигнет вершины
        while (currentHeight < h) {
            days++; // Увеличиваем счетчик дней
            currentHeight += a; // Улитка поднимается вверх

            // Проверяем, достигла ли улитка вершины
            if (currentHeight >= h) {
                break; // Если достигла, выходим из цикла
            }

            currentHeight -= b; // Улитка сползает вниз
        }

        System.out.println(days); // Выводим количество дней

        scanner.close(); // Закрываем сканер
    }

}
