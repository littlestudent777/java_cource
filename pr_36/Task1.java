public class Practice1 {

    public static void main(String[] args) {
        // Несколько исключений обрабатываются одинаково
        try {
            // Генерация разных исключений
            throw new IllegalArgumentException("Неверный аргумент.");
            throw new NullPointerException("Объект не инициализирован.");
            throw new ArithmeticException("Деление на ноль.");
        } catch (IllegalArgumentException | NullPointerException | ArithmeticException e) {
            // Обработка всех исключений одинаково
            System.out.println("Обработано исключение: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        // Исключения образуют иерархию Ex1 <|-- Ex2 <|-- Ex3
        try {
            // Генерация исключения Ex3
            throw new Ex3();
        } catch (Ex1 e) {  // Обрабатываем общее исключение Ex1, которое перехватит все дочерние
            System.out.println("Обработано исключение Ex1");
        }
    }

    // Создание иерархии исключений
    static class Ex1 extends Exception {}
    static class Ex2 extends Ex1 {}
    static class Ex3 extends Ex2 {}
}
