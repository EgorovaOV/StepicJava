import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем коэффициенты a, b и c
        //System.out.print("Введите коэффициенты a, b и c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Вычисляем дискриминант
        double discriminant = b * b - 4 * a * c;

        // Проверяем значение дискриминанта
        if (discriminant > 0) {
            // Два различных корня
            double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            // Выводим корни в порядке возрастания
            if (x1 > x2) {
                double temp = x1;
                x1 = x2;
                x2 = temp;
            }
            System.out.printf("%.1f %.1f%n", x1, x2);
        } else if (discriminant == 0) {
            // Один корень
            double x = -b / (2 * a);
            System.out.printf("%.1f%n", x);
        } else {
            // Нет корней
            System.out.println("без корней");
        }

        scanner.close(); // Закрываем сканер
    }
}
