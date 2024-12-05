public class NumberOperations {
    // Метод для нахождения суммы целых чисел с переменным числом параметров
    public int sum(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    // Перегруженный метод для нахождения суммы с плавающей точкой
    public double sum(double... numbers) {
        double total = 0.0;
        for (double number : numbers) {
            total += number;
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        NumberOperations op = new NumberOperations();

        // Использование метода с переменным числом параметров
        int sum1 = op.sum(1, 2, 3, 4);
        System.out.println(sum1); // Вывод: 10

        // Использование метода с переменным числом параметров для чисел с плавающей точкой
        double sum2 = op.sum(1.5, 2.5, 3.5);
        System.out.println(sum3); // Вывод: 7.5
    }
}
