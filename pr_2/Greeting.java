import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения данных из консоли
        Scanner scan = new Scanner(System.in);

        try {
            // Просим пользователя ввести имя
            System.out.print("Введите ваше имя: ");

            // Читаем введенное имя
            String name = scan.nextLine();

            // Проверка на пустое имя
            if (name.trim().isEmpty()) {
                throw new IllegalArgumentException("Имя не может быть пустым.");
            }

            // Выводим приветствие
            System.out.println("Привет, " + name + "!");

        } catch (IllegalArgumentException e) {
            // Обработка случая, если имя пустое
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            // Общая обработка исключений
            System.out.println("Произошла ошибка: " + e.getMessage());
        } finally {
            // Закрываем Scanner в блоке finally для гарантии освобождения ресурсов
            scan.close();
        }
    }
}