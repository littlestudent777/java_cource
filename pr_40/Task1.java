import java.io.FileInputStream;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        // Путь к файлу, который мы будем читать
        String filePath = "example.txt";

        // Создаем объект FileInputStream
        try (FileInputStream fis = new FileInputStream(filePath)) {
            // Переменная для хранения прочитанного байта
            int byteData;

            // Читаем байты из файла до тех пор, пока файл не закончится
            while ((byteData = fis.read()) != -1) {
                // Преобразуем байт в символ и выводим на консоль
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Обрабатываем исключение
        }
    }
}
