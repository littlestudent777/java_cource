// Базовый класс
abstract class Shape {
    // Метод для получения площади фигуры
    public abstract double getArea();
}

class Rectangle extends Shape {
    private double width;  // Ширина
    private double height; // Высота

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Реализация метода getArea для прямоугольника
    @Override
    public double getArea() {
        return width * height;
    }
}

class Square extends Shape {
    private double side; // Сторона квадрата

    public Square(double side) {
        this.side = side;
    }

    // Реализация метода getArea для квадрата
    @Override
    public double getArea() {
        return side * side; // Площадь = сторона * сторона
    }
}

/*
Принцип подстановки Лисков (LSP) утверждает, что объекты подкласса (Rectangle и Square)
должны быть взаимозаменяемыми с объектами суперкласса (Shape).
В этом примере, любые экземпляры Rectangle и Square могут быть использованы вместо
Shape без нарушения корректности программы.
Это позволяет обрабатывать объекты различных подклассов единообразно,
что минимизирует риск ошибок и делает код более гибким.
*/

public class Main {
    public static void main(String[] args) {
        // Создаем массив фигур
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(5, 10); // Прямоугольник 5 на 10
        shapes[1] = new Square(4);         // Квадрат со стороной 4

        // Выводим площади фигур
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
        }
    }
}