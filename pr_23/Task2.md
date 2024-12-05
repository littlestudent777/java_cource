```markdown
Пример переопределенного метода
Рассмотрим простой пример с двумя классами: Animal (суперкласс) и Dog (подкласс).
```
```java
class Animal {
    public void sound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    // Переопределение метода sound()
    @Override
    public void sound() {
        System.out.println("Собака лает");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();

        myAnimal.sound(); // вывод: Животное издает звук
        myDog.sound();    // вывод: Собака лает
    }
}
```
```markdown
Класс Animal включает в себя метод sound(), класс Dog наследует Animal и переопределяет метод sound().
В методе main() создаются объекты myAnimal и myDog, и когда мы вызываем метод sound() для каждого объекта,
Java использует динамическое связывание для вызова соответствующего метода.
```
```markdown
Важность возвращаемого значения:
Если у переопределяемого (в суперклассе) и переопределенного (в подклассе) методов не совпадает тип
возвращаемого значения, это может вызвать проблемы.
```
```markdown
Совместимость типов: Если возвращаемый тип подкласса является более специфичным типом (субтипом),
это допустимо в Java.
Например, если в суперклассе метод возвращает тип Animal, а в подклассе метод возвращает тип Dog, это возможно:
```
```java
   class Animal {
       public Animal sound() {
           System.out.println("Животное издает звук");
           return this;
       }
   }

   class Dog extends Animal {
       @Override
       public Dog sound() {
           System.out.println("Собака лает");
           return this;
       }
   }
```
```markdown
Несовпадающие типы: Если возвращаемые типы не связаны, то это приведет к ошибке компиляции.
Например, если в суперклассе метод возвращает int, а в подклассе возвращает String, то это невозможно:
```
```java
   class Animal {
       public int sound() {
           return 1; // метод возвращает int
       }
   }

   class Dog extends Animal {
       @Override
       public String sound() { // ошибка компиляции
           return "Собака лает";
       }
   }
```
