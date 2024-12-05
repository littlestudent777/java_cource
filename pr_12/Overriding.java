class Animal {
   public void move() {
      System.out.println("Animals can move");
   }
}

class Dog extends Animal {
   public void move() {
      System.out.println("Dogs can walk and run");
   }
}

public class Overriding {
   public static void main(String args[]) {
      Animal a = new Animal();
      Animal b = new Dog();

      a.move();   // вызывает метод из Animal
      b.move();   // вызывает метод из Dog
   }
}
