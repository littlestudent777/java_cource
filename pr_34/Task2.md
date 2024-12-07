```markdown
1. ArithmeticException
Исключение при арифметических операциях, например, при делении на ноль.
```
```java
public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Это вызовет ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Произошла арифметическая ошибка: " + e.getMessage());
        }
    }
}
```
```markdown
2. ArrayIndexOutOfBoundsException
Это исключение возникает, когда программа пытается получить доступ к элементу массива по индексу, который находится вне границ массива.
```
```java
public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            int number = numbers[5]; // Это вызовет ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка доступа к массиву: " + e.getMessage());
        }
    }
}
```
```markdown
3. IllegalArgumentException
Это исключение выбрасывается, когда метод получает аргумент, который находится вне допустимого диапазона.
```
```java
public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            setAge(-5); // Это вызовет IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Недопустимый аргумент: " + e.getMessage());
        }
    }

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        System.out.println("Возраст установлен: " + age);
    }
}
```
```markdown
4. ClassCastException
Это исключение возникает, когда происходит попытка привести объект к неправильному типу.
```
```java
public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object obj = "Это строка";

        try {
            Integer number = (Integer) obj; // Это вызовет ClassCastException
        } catch (ClassCastException e) {
            System.out.println("Ошибка приведения типов: " + e.getMessage());
        }
    }
}
```
```markdown
5. NullPointerException
Это исключение возникает, когда программа пытается использовать объект, который имеет значение null.
```
```java
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String text = null;

        try {
            int length = text.length(); // Это вызовет NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Ошибка, связанная с нулевым указателем: " + e.getMessage());
        }
    }
}
```
