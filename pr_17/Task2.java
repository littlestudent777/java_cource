import java.util.ArrayList;
import java.util.List;

class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Task2 {
    // Метод, принимающий список с ограничением по верхнему предку
    public static void makeSounds(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    // Метод, принимающий список с ограничением по нижнему предку
    public static void addDog(List<? super Dog> list) {
        list.add(new Dog());
    }

    public static void main(String[] args) {
        // Создаем списки животных
        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        
        // Используем метод с <? extends Animal>
        dogs.add(new Dog());
        cats.add(new Cat());
        
        List<Animal> animals = new ArrayList<>();
        animals.addAll(dogs);
        animals.addAll(cats);
        makeSounds(animals); // Вызов метода, который печатает звуки животных
        
        // Используем метод с <? super Dog>
        List<Animal> animalList = new ArrayList<>();
        addDog(animalList); // Добавляем собаку в список животных
    }
}

/*
Объяснение:
<? extends T> (ограничение по верхнему предку):
Используется, когда мы хотим работать с коллекциями, которые могут содержать объекты типа T или его подклассы.
В приведенном примере метод makeSounds принимает список животных (List<? extends Animal>). Мы можем передать ему список, содержащий объекты Dog, Cat или любой другой подкласс Animal. 
Это позволяет обрабатывать коллекции различных подтипов Animal единообразно.

<? super T> (ограничение по нижнему предку):
Используется, когда мы хотим добавлять объекты типа T или его подклассов в коллекцию, не зная точно, какой тип содержит эта коллекция.
Метод addDog принимает список с ограничением по нижнему предку (List<? super Dog>). Это значит, что в этот метод мы можем передать список, который может содержать объекты типа 
Dog, Animal, или объекты более общего типа.

Зачем это нужно?
Такие конструкции позволяют создавать более гибкие и обобщенные методы и классы, которые могут работать с различными типами данных, минимизируя дублирование кода.
Это помогает соблюдать принципы ООП в Java, улучшая читаемость и поддержку кода.
*/
