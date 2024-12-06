```markdown
В Java внешний класс имеет полный доступ ко всем полям и методам своего внутреннего класса,
независимо от спецификаторов доступа. 

Пример: Доступ к полям и методам внутреннего класса с различными спецификаторами доступа
```
```java
class OuterClass {
    // Вложенный класс
    class InnerClass {
        private String privateField = "Private Field in InnerClass";
        String defaultField = "Default Field in InnerClass";
        protected String protectedField = "Protected Field in InnerClass";
        public String publicField = "Public Field in InnerClass";

        private void privateMethod() {
            System.out.println("Private Method in InnerClass");
        }

        void defaultMethod() {
            System.out.println("Default Method in InnerClass");
        }

        protected void protectedMethod() {
            System.out.println("Protected Method in InnerClass");
        }

        public void publicMethod() {
            System.out.println("Public Method in InnerClass");
        }
    }

    // Метод внешнего класса для доступа к внутреннему
    void accessInnerClass() {
        InnerClass inner = new InnerClass();

        // Доступ к полям внутреннего класса
        System.out.println(inner.privateField);      // Доступ разрешён
        System.out.println(inner.defaultField);      // Доступ разрешён в рамках одного пакета
        System.out.println(inner.protectedField);    // Доступ разрешён
        System.out.println(inner.publicField);       // Доступ разрешён

        // Доступ к методам внутреннего класса
        inner.privateMethod();      // Доступ разрешён
        inner.defaultMethod();      // Доступ разрешён
        inner.protectedMethod();    // Доступ разрешён
        inner.publicMethod();       // Доступ разрешён
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.accessInnerClass();
    }
}
```
