interface MyInterface {
    // Неабстрактный метод с реализацией (default method)
    default void defaultMethod() {
        System.out.println("I'm from default method.");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("I'm from static method.");
    }
}

// Класс, реализующий интерфейс MyInterface
class MyClass implements MyInterface {
    // Не нужно переопределять defaultMethod, так как он уже определен в интерфейсе
}

public class Task1 {
    public static void main(String[] args) {
        // Вызов статического метода интерфейса
        MyInterface.staticMethod();

        // Создание объекта класса, реализующего интерфейс
        MyClass myObject = new MyClass();

        // Вызов дефолтного метода через объект класса
        myObject.defaultMethod();

        // Вызов дефолтного метода через интерфейс
        MyInterface myInterface = new MyClass();
        myInterface.defaultMethod();
    }
}
