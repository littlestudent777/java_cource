/**
 * Класс Rectangle представляет прямоугольник.
 */
public class Rectangle {

    private double width;  // Ширина прямоугольника
    private double height; // Высота прямоугольника

    /**
     * Конструктор класса Rectangle.
     *
     * @param width  Ширина прямоугольника
     * @param height Высота прямоугольника
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Метод calculateArea вычисляет площадь прямоугольника.
     *
     * @return Площадь прямоугольника
     */
    public double calculateArea() {
        return width * height;
    }
}
