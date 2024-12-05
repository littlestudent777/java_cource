package myPackage;

public class ClassA {
    // Член класса с модификатором доступа private
    private int privateVar = 10;

    // Член класса с модификатором доступа по умолчанию (default)
    int defaultVar = 20;

    // Член класса с модификатором доступа protected
    protected int protectedVar = 30;

    // Член класса с модификатором доступа public
    public int publicVar = 40;

    // Метод для демонстрации доступа к переменным
    public void displayVariables() {
        System.out.println("Private Variable: " + privateVar);
        System.out.println("Default Variable: " + defaultVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Public Variable: " + publicVar);
    }
}
        classB.accessClassA(); // Доступ к ClassA из одного пакета

        ClassC classC = new ClassC();
        classC.accessClassA(); // Доступ к ClassA из другого пакета
    }
}
