```markdown
Внутренний класс в Java имеет доступ ко всем полям и методам своего внешнего класса,
независимо от спецификаторов доступа.

Пример 1: Внутренний класс с доступом к private полям внешнего класса
```
```java
public class Outer {
    private int outerField = 10;

    private void outerMethod() {
        System.out.println("Метод внешнего класса.");
    }

    class Inner {
        public void accessOuter() {
            // Доступ к private полю внешнего класса
            System.out.println("Поле внешнего класса: " + outerField);
            // Вызов private метода внешнего класса
            outerMethod();
        }
    }
    
    public void createInner() {
        Inner inner = new Inner();
        inner.accessOuter();
    }
}

class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.createInner(); // Вызов метода, который создает внутренний класс
    }
}
```
```markdown
Объяснение: Внутренний класс Inner может напрямую обращаться к приватным полям и методам внешнего класса Outer.
            В методе accessOuter() он использует outerField и вызывает outerMethod(), оба из которых имеют
            спецификатор private.

Пример 2: Внутренний класс и доступ к protected и public полям
```
```java
public class Outer {
    protected int outerProtectedField = 20;
    public int outerPublicField = 30;

    class Inner {
        public void accessOuter() {
            // Доступ к protected полю внешнего класса
            System.out.println("Protected поле внешнего класса: " + outerProtectedField);
            // Доступ к public полю внешнего класса
            System.out.println("Public поле внешнего класса: " + outerPublicField);
        }
    }
    
    public void createInner() {
        Inner inner = new Inner();
        inner.accessOuter();
    }
}

class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.createInner(); // Вызов метода, который создает внутренний класс
    }
}
```
```markdown
Объяснение: В этом примере внутренний класс Inner получает доступ как к protected полю outerProtectedField,
            так и к public полю outerPublicField. Оба эти поля доступны для внутреннего класса,
            поскольку он находится в пределах внешнего класса.

Пример 3: Доступ к полям с модификатором по умолчанию
```
```java
public class Outer {
    int defaultField = 40; // поле с модификатором доступа по умолчанию

    class Inner {
        public void accessOuter() {
            // Доступ к полю с модификатором доступа по умолчанию
            System.out.println("Поле с модификатором по умолчанию: " + defaultField);
        }
    }
    
    public void createInner() {
        Inner inner = new Inner();
        inner.accessOuter();
    }
}

class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.createInner(); // Вызов метода, который создает внутренний класс
    }
}
```
```markdown
Объяснение: В этом примере внутренний класс Inner имеет доступ к полю defaultField,
            которое имеет спецификатор доступа по умолчанию. Так как оба класса находятся в одном пакете,
            доступ к этому полю возможен.
```
