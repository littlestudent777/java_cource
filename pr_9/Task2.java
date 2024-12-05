public class Task2 {
    public static void main(String[] args) {
        int number = 0;

        while (number <= 10) {
            if (number % 2 == 0) {
                // Пропускаем четные числа
                number++;
                continue; // Переходим к следующей итерации цикла
            }

            if (number == 8) {
                // Выходим из цикла, если число равно 8
                break;
            }

            System.out.println("Нечетное число: " + number);
            number++;
        }

        System.out.println("Цикл завершен.");
    }
}
