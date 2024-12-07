```markdown
Интерфейс AutoCloseable в Java был введён в версии Java 7 и позволяет автоматически
освобождать ресурсы, когда они больше не нужны. Это особенно полезно в ситуации с
потоками или ресурсами, которые требуют явного закрытия, поскольку он обеспечивает
более безопасное и чистое управление ресурсами.

Когда класс реализует интерфейс AutoCloseable, его метод close() будет автоматически
вызываться в блоке try-with-resources. Это помогает избежать утечек ресурсов, так
как даже если в блоке try возникнет исключение, ресурсы будут корректно закрыты.
```
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoCloseableExample {
    public static void main(String[] args) {
        // Используем try-with-resources для автоматического закрытия BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Здесь BufferedReader будет автоматически закрыт, даже если возникло исключение
    }
}
```
