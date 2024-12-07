public class Task1 {
    public static void main(String[] args) {
        // 1. Вычисление длины строки
        String str1 = "Java";
        System.out.println("Длина строки 'Java': " + str1.length()); // 4

        // 2. Проверка на пустую строку
        String s = ""; // пустая строка
        if (s.isEmpty()) {
            System.out.println("Строка пуста");
        }

        // 3. Сравнение строк с помощью equals()
        String x = "Test String";
        System.out.println("Сравнение с 'Test String': " + "Test String".equals(x)); // true

        // 4. Сравнение строк с учетом регистра с помощью equalsIgnoreCase()
        System.out.println("Сравнение с 'test string' (без учета регистра): " + "test string".equalsIgnoreCase(x)); // true

        // 5. Разбиение строки на массив строк
        String people = "Philip J. Fry; Turanga Leela; Bender Bending Rodriguez; Amy Wong";
        String[] peopleArray = people.split("; ");
        System.out.println("Список людей:");
        for (String human : peopleArray) {
            System.out.println(human); // Каждое имя выведется на отдельной строке
        }

        // 6. Извлечение подстроки из строки
        String filePath = "D:\\Movies\\Futurama.mp4";
        // 7. Нахождение индекса последнего вхождения подстроки
        int lastFileSeparatorIndex = filePath.lastIndexOf('\\');
        String fileName = filePath.substring(lastFileSeparatorIndex + 1);
        System.out.println("Имя файла: " + fileName); // Futurama.mp4

        // 8. Удаление пробелов в начале и в конце строки
        String originalString = "   Hello, World!   ";
        String trimmedString = originalString.trim();
        System.out.println("После trim: '" + trimmedString + "'"); // 'Hello, World!'

        // 9. Преобразование строки в верхний регистр
        String upperCaseString = trimmedString.toUpperCase();
        System.out.println("В верхнем регистре: " + upperCaseString); // 'HELLO, WORLD!'

        // 10. Преобразование строки в нижний регистр
        String lowerCaseString = upperCaseString.toLowerCase();
        System.out.println("В нижнем регистре: " + lowerCaseString); // 'hello, world!'
    }
}
