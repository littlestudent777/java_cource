```markdown
Пример 1: Вложенный класс со спецификатором public:
```
```java
public class Outer {
    public class Inner {
        public void display() {
            System.out.println("Public inner class.");
        }
    }
    
    public void createInner() {
        Inner inner = new Inner();
        inner.display();
    }
}

class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.createInner();
        
        Outer.Inner inner = new Outer().new Inner();
        inner.display();
    }
}
```
```markdown
Объяснение: Вложенный класс Inner объявлен как public, поэтому он доступен из любого места,
            где доступен внешний класс Outer.
            Можно создавать экземпляры Inner как внутри Outer, так и снаружи.

Пример 2: Вложенный класс со спецификатором private:
```
```java
public class Outer {
    private class Inner {
        public void display() {
            System.out.println("Private inner class.");
        }
    }
    
    public void createInner() {
        Inner inner = new Inner();
        inner.display();
    }
}

class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.createInner(); // Работает
        
        // Outer.Inner inner = new Outer().new Inner(); // Ошибка
    }
}
```
```markdown
Объяснение: Вложенный класс Inner имеет спецификатор доступа private, поэтому он доступен только внутри класса Outer.
            Попытка создать экземпляр Inner снаружи приводит к ошибке компиляции.

Пример 3: Вложенный класс со спецификатором protected:
```
```java
public class Outer {
    protected class Inner {
        public void display() {
            System.out.println("Protected inner class.");
        }
    }
}

class SubOuter extends Outer {
    public void createInner() {
        Inner inner = new Inner();
        inner.display();
    }
}

class Test {
    public static void main(String[] args) {
        SubOuter subOuter = new SubOuter();
        subOuter.createInner(); // Работает
        
        // Outer.Inner inner = new Outer().new Inner(); // Ошибка
    }
}
```
```markdown
Объяснение: Вложенный класс Inner со спецификатором protected доступен в дочерних классах,
            таких как SubOuter, и в том же пакете. Однако Inner недоступен из прочих классов.

Пример 4: Вложенный класс по умолчанию:
```
```java
public class Outer {
    class Inner {
        public void display() {
            System.out.println("Default inner class.");
        }
    }
}

class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display(); // Работает
    }
}
```
```markdown
Объяснение: Вложенный класс Inner без спецификатора доступа имеет пакетную видимость.
```
