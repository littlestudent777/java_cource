//В арифметических операциях типы автоматически приводятся к типам с наибольшим диапазоном
public class ArithmeticOperations {
    public static void main(String[] args) {
        // Пример 1: int и double
        int a = 10;
        double b = 5.5;
        //int и double складываются, с приведением int к double.
        double result1 = a + b;
        System.out.println("Результат (int + double): " + result1); // 15.5

        // Пример 2: float и int
        float x = 3.5f;
        int y = 2;
        //float умножается на int, с приведением int к float.
        float result2 = x * y;
        System.out.println("Результат (float * int): " + result2); // 7.0

        // Пример 3: int, byte и short
        int m = 100;
        byte n = 20;
        short p = 30;
        //происходит сложение int, byte и short, и все приведены к int.
        int result3 = m + n + p;
        System.out.println("Результат (int + byte + short): " + result3); // 150
    }
}
