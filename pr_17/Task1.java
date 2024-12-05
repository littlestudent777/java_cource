import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Task1 {
    public static void main(String[] args) {
        // Создаем объекты Box с разными параметризованными типами
        Box<String> stringBox = new Box<>("Hello, World!");
        Box<Integer> integerBox = new Box<>(42);
        Box<Double> doubleBox = new Box<>(3.14);

        // Добавляем их в список
        List<Box<?>> boxes = new ArrayList<>();
        boxes.add(stringBox);
        boxes.add(integerBox);
        boxes.add(doubleBox);

        // Используем оператор instanceof для проверки типов
        for (Box<?> box : boxes) {
            if (box.getItem() instanceof String) {
                System.out.println("String box contains: " + box.getItem());
            } else if (box.getItem() instanceof Integer) {
                System.out.println("Integer box contains: " + box.getItem());
            } else if (box.getItem() instanceof Double) {
                System.out.println("Double box contains: " + box.getItem());
            } else {
                System.out.println("Unknown type in box");
            }
        }
    }
}
