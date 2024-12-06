interface OuterInterface {
    // Метод интерфейса, который должен быть реализован классом
    void interfaceMethod();

    // Вложенный класс внутри интерфейса
    class NestedClass {
        public void displayMessage() {
            System.out.println("I'm from NestedClass.");
        }
    }
}

public class NestedClassInInterface {
    public static void main(String[] args) {
        // Создание экземпляра вложенного класса через интерфейс
        OuterInterface.NestedClass nested = new OuterInterface.NestedClass();
        
        // Вызов метода displayMessage() у экземпляра вложенного класса
        nested.displayMessage();
    }
}
