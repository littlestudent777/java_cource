import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Указываем путь к файлу
        File file = new File("example.txt");
        
        // Создаем Scanner для чтения файла
        try (Scanner scanner = new Scanner(file)) {
            // Читаем файл построчно
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line); // Выводим строку на экран
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
