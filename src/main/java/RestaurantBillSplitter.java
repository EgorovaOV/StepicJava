import java.util.Scanner;

public class RestaurantBillSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем общую сумму счета
        System.out.print("Введите общую сумму счета: ");
        int totalBill = scanner.nextInt();

        // Проверка на отрицательное значение счета
        if (totalBill < 0) {
            System.out.println("Еда не так плоха, чтобы за ее поедание доплачивали");
            return; // Завершаем выполнение программы
        }

        // Считываем количество друзей
        System.out.print("Введите количество друзей: ");
        int numberOfFriends = scanner.nextInt();

        // Проверка на отрицательное или нулевое значение количества друзей
        if (numberOfFriends <= 0) {
            System.out.println("Кто здесь?!");
            return; // Завершаем выполнение программы
        }

        // Рассчитываем общую сумму с чаевыми
        double totalWithTip = totalBill * 1.10; // Добавляем 10% чаевых

        // Рассчитываем часть к оплате для каждого друга
        int share = (int) Math.ceil(totalWithTip / numberOfFriends); // Округляем вверх

        // Выводим результат
        System.out.println("Каждый друг должен заплатить: " + share);

        scanner.close(); // Закрываем сканер
    }
}
