class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        // Вызов конструктора суперкласса
        super(name);
        this.breed = breed;
    }

    // Метод, переопределяющий метод суперкласса
    @Override
    void sound() {
        // Вызов метода суперкласса
        super.sound();
        System.out.println("Собака лает: Гав-гав!");
    }

    void showInfo() {
        // Доступ к полю суперкласса
        System.out.println("Имя: " + super.name);
        System.out.println("Порода: " + this.breed);
    }
}

public class Task1 {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик", "Немецкая овчарка");
        dog.sound();
        dog.showInfo();
    }
}
