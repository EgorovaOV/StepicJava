import java.util.Scanner;

public class Parol {
    // Секретный пароль
    private static final int password = 133976;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем ввод числа-пароля
        int inputPassword = scanner.nextInt();

        // Проверяем введённый пароль
        if (inputPassword == password) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }

        scanner.close(); // Закрываем сканер
    }
}
