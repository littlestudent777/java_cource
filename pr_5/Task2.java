class Animal {}
class Dog extends Animal {}

public class Task2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Animal nullAnimal = null;

        // Примеры использования instanceof
        System.out.println("animal instanceof Animal: " + (animal instanceof Animal));  // true
        System.out.println("dog instanceof Dog: " + (dog instanceof Dog));              // true
        System.out.println("dog instanceof Animal: " + (dog instanceof Animal));        // true

        // Применение к объекту null
        System.out.println("nullAnimal instanceof Animal: " + (nullAnimal instanceof Animal));  // false
        System.out.println("nullAnimal instanceof Dog: " + (nullAnimal instanceof Dog));      // false
    }
}
