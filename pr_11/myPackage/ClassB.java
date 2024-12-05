package myPackage;

public class ClassB {
    public void accessClassA() {
        ClassA objA = new ClassA();

        // Доступ к полям и методам класса ClassA
        // System.out.println(objA.privateVar); // Ошибка: privateVar имеет модификатор private
        System.out.println("Default Variable from ClassA: " + objA.defaultVar); // Доступно
        System.out.println("Protected Variable from ClassA: " + objA.protectedVar); // Доступно
        System.out.println("Public Variable from ClassA: " + objA.publicVar); // Доступно

        // Вызов метода для отображения переменных
        objA.displayVariables();
    }
}
