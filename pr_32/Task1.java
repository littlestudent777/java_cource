public class Task1 {
    public static void main(String[] args) {
        // Пример с StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // 1. Append: добавляет строку в конец объекта StringBuffer
        stringBuffer.append(" World");
        System.out.println("StringBuffer after append: " + stringBuffer);

        // 2. Insert: вставляет строку по заданной позиции
        stringBuffer.insert(5, ",");
        System.out.println("StringBuffer after insert: " + stringBuffer);

        // 3. Delete: удаляет подстроку по указанному диапазону
        stringBuffer.delete(5, 6); // Удаляем запятую
        System.out.println("StringBuffer after delete: " + stringBuffer);

        // 4. Reverse: разворачивает строку
        stringBuffer.reverse();
        System.out.println("StringBuffer after reverse: " + stringBuffer);

        // 5. Replace: заменяет часть строки в указанном диапазоне заданной строкой
        stringBuffer.replace(0, 5, "Hi");
        System.out.println("StringBuffer after replace: " + stringBuffer);

        // 6. Capacity: возвращает текущую емкость StringBuffer
        System.out.println("StringBuffer capacity: " + stringBuffer.capacity());

        // Пример с StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Goodbye");

        // 7. Append: добавляет строку в конец объекта StringBuilder
        stringBuilder.append(" World!");
        System.out.println("StringBuilder after append: " + stringBuilder);

        // 8. Insert: вставляет строку по заданной позиции
        stringBuilder.insert(7, ",");
        System.out.println("StringBuilder after insert: " + stringBuilder);

        // 9. Delete: удаляет подстроку по указанному диапазону
        stringBuilder.delete(7, 8); // Удаляем запятую
        System.out.println("StringBuilder after delete: " + stringBuilder);

        // 10. Capacity: возвращает текущую емкость StringBuilder
        System.out.println("StringBuilder capacity: " + stringBuilder.capacity());
    }
}
