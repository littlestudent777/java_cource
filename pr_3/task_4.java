public class StringConcatenationExample {
    public static void main(String[] args) {
        // Пример 1: Конкатенация String и int
        String name = "Violet";
        int age = 30;
        String introduction = name + " is " + age + " years old.";
        System.out.println(introduction); //Violet is 30 years old.

        // Пример 2: Конкатенация String и double
        double height = 1.75;
        String heightInfo = name + "'s height is " + height + " meters.";
        System.out.println(heightInfo); // Вывод: Violet's height is 1.75 meters.

        // Пример 3: Конкатенация String и char
        char initial = 'D';
        String fullName = initial + ". " + name;
        System.out.println(fullName); // Вывод: D. Violet

        // Пример 4: Конкатенация String и Object
        Object obj = new Object();
        String objectInfo = "The object is of type: " + obj;
        System.out.println(objectInfo); // Вывод: The object is of type: java.lang.Object@<hashcode>
    }
}
