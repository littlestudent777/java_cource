import myPackage.ClassB;
import otherPackage.ClassC;

public class TestAccessModifiers {
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.accessClassA(); // Доступ к ClassA из одного пакета

        ClassC classC = new ClassC();
        classC.accessClassA(); // Доступ к ClassA из другого пакета
    }
}
