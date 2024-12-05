```markdown
Задание 1: Если метод объявлен со спецификатором final, то его запрещено переопределять в подклассе.
```
```java
class SuperClass {
    // Метод, объявленный с модификатором final
    public final void finalMethod() {
        System.out.println("Это final метод суперкласса.");
    }
}

class SubClass extends SuperClass {
    // Попытка переопределения финального метода
    // Это приведет к ошибке компиляции
    /*
    @Override
    public void finalMethod() {
        System.out.println("Попытка переопределить финальный метод.");
    }
    */
}

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.finalMethod(); // Вызов final метода суперкласса

        SubClass subClass = new SubClass();
        subClass.finalMethod(); // Вызов final метода суперкласса через подкласс
    }
}
```
```markdown
Задание 2: Если класс объявлен со спецификатором final, то для него невозможно создать подкласс.
```
```java
final class FinalClass {
    public void displayMessage() {
        System.out.println("Это final класс.");
    }
}

// Попытка создать подкласс
// Это приведет к ошибке компиляции
/*
class SubClass extends FinalClass {
    public void anotherMethod() {
        System.out.println("Метод в подклассе.");
    }
}
*/

public class Main {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.displayMessage(); // Вызов метода final класса
        // SubClass subClass = new SubClass(); // Этот код также вызовет ошибку 
    }
}
```
