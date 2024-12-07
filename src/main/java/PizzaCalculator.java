import java.util.Scanner;

public class PizzaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем количество людей
        //System.out.print("Введите количество людей: ");
        int numberOfPeople = scanner.nextInt();

        // Считываем количество кусочков в одной пицце
       //System.out.print("Введите количество кусочков в одной пицце: ");
        int slicesPerPizza = scanner.nextInt();

        // Вычисляем наименьшее общее кратное (НОК)
        int lcm = lcm(numberOfPeople, slicesPerPizza);

        // Количество пицц, необходимых для получения НОК кусочков
        int pizzasNeeded = lcm / slicesPerPizza;

        // Выводим результат
        System.out.println(pizzasNeeded);

        scanner.close(); // Закрываем сканер
    }

    // Метод для вычисления НОК
    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Метод для вычисления НОД (наибольший общий делитель)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}