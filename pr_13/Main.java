public class Main {
    public static void main(String[] args) {
        // Вызов метода printVars() через имя класса A
        A.printVars();

        // Создание экземпляра класса A (необязательно для статических методов, но возможно)
        A obj = new A();
        // Вызов метода printVars() через экземпляр
        obj.printVars(); // Этот вызов допустим, но не является общепринятой практикой

        // Вызов из другой части программы
        AnotherClass.someMethod();
    }
}

class AnotherClass {
    public static void someMethod() {
        // Вызов метода printVars() через имя класса A
        A.printVars();
    }
}
