```markdown
Аннотации:
1. @Override
Используется для указания на то, что метод переопределяет метод суперкласса.
Это удобно, так как если по ошибке разработчик не переопределит метод (например, из-за неправильной сигнатуры),
компилятор выдаст ошибку, что поможет найти проблемы на этапе компиляции.
```
```java
class Superclass {
    void display() {
        System.out.println("I'm from from Superclass");
    }
}

class Subclass extends Superclass {
    @Override
    void display() {
        System.out.println("I'm from Subclass");
    }
}

public class Main {
    public static void main(String[] args) {
        Subclass child = new Subclass();
        child.display(); // Выводит: I'm from Subclass
    }
}
```
```markdown
2. @Deprecated
Указывает на то, что элемент устарел и не рекомендуется для использования.
Обычно это означает, что существует более новая альтернатива.
Использование этой аннотации особенно полезно для поддержания обратной совместимости,
так как позволяет разработчикам узнать, что данный элемент маловероятно будет поддерживаться в будущем.
```
```java
class LegacyCode {

    @Deprecated
    void oldMethod() {
        System.out.println("This is an old method.");
    }

    void newMethod() {
        System.out.println("This is a new method.");
    }
}

public class Main {
    public static void main(String[] args) {
        LegacyCode legacy = new LegacyCode();
        legacy.oldMethod(); // Вызывает устаревший метод, что может вызывать предупреждение компилятора
        legacy.newMethod(); // Вызывает новый метод
    }
}
```
```markdown
3. @SuppressWarnings
Используется для подавления предупреждений компилятора. Это может быть полезно в ситуациях,
когда разработчик знает, что определённые предупреждения не являются проблемой, но не хочет,
чтобы они отображались во время компиляции.
```
```java
import java.util.ArrayList;
import java.util.List;

public class Main {

    @SuppressWarnings("unchecked") // Подавляем предупреждение о неявном приведении типов
    public static void main(String[] args) {
        List rawList = new ArrayList();
        rawList.add("Test"); // Добавляем строку

        // Приведение к типу List<String>
        List<String> stringList = rawList; // Здесь возникает предупреждение, но оно подавляется
        System.out.println(stringList.get(0)); // Выводит: Test
    }
}
```
