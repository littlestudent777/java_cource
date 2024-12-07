```markdown
Что произойдет, если класс реализует два интерфейса с одинаковыми неабстрактными методами?
Если два интерфейса имеют методы по умолчанию с одинаковой сигнатурой, это вызовет конфликт,
и компилятор выдаст ошибку.

Как решить проблему:
Необходимо переопределить метод в классе, который реализует оба интерфейса. 
Таким образом, мы явно указываем, какой функционал мы хотим использовать.

Пример:
```
```java
interface InterfaceA {
    default void display() {
        System.out.println("Display from InterfaceA");
    }
}

interface InterfaceB {
    default void display() {
        System.out.println("Display from InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    @Override
    public void display() {
        // Выбираем, какой метод использовать, или реализуем собственный функционал
        InterfaceA.super.display();  // Вызов метода из InterfaceA
        // или
        // InterfaceB.super.display();  // Вызов метода из InterfaceB
        System.out.println("Display from MyClass");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}
```
