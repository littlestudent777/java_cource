package otherPackage;

import myPackage.ClassA;

public class ClassC {
    public void accessClassA() {
        ClassA objA = new ClassA();

        // System.out.println(objA.privateVar); // Ошибка: privateVar имеет модификатор private
        // System.out.println(objA.defaultVar); // Ошибка: defaultVar доступно только в том же пакете
        // System.out.println(objA.protectedVar); // Ошибка: protectedVar доступно только для подклассов и классов из того же пакета
        System.out.println("Public Variable from ClassA: " + objA.publicVar); // Доступно
    }
}
