```markdown
* Чтобы объявить один класс наследником от другого, надо использовать после имени класса-наследника
ключевое слово extends, после которого идет имя базового класса.
```
```java
class Vehicle {
    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
}

public class Example_1 {
    public static void main(String[] args) {
        // Create a myCar object
        Car myCar = new Car();
        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();
    }
}
```
```markdown
* Также в наследовании применяется ключевое слово super. Оно нужно в 2ух случаях: 
	- для дифференциации членов суперкласса от членов подкласса, если у них есть одинаковые имена
      Например:  super.variable, super.method();
	- для вызова конструктора суперкласса из подкласса
```
```java
class Person {
    private String name;

    public Person(String name) {
        // this указывает на то, что нужно вызывать переменную не метода, а класса
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    public Employee(String name) {
        // Таким образом, присвоение значения поля name делегируется
        // конструктору базового класса
        super(name);
    }
}

public class Example_2 {
    public static void main(String[] args) {
        Employee sam = new Employee("Sam");
        sam.display();
    }
}
```
