import java.io.FileOutputStream;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        // Путь к файлу, в который мы будем записывать данные
        String filePath = "output.txt"; 

        // Создаем объект FileOutputStream
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            // Данные, которые мы будем записывать
            String data = "Hello, World!\n";

            // Записываем данные побайтово
            for (int i = 0; i < data.length(); i++) {
                fos.write(data.charAt(i)); // Записываем каждый символ как байт
            }
          
        } catch (IOException e) {
            e.printStackTrace(); // Обрабатываем исключение
        }
    }
}
