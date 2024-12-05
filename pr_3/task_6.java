public class NarrowingConversions {
    public static void main(String[] args) {
        // Пример 1: int к byte
        int intValue = 130;
        byte byteValue = (byte) intValue; // Сужающее преобразование, возможна потеря данных
        System.out.println("int to byte: " + byteValue); //-126 (переполнение)

        // Пример 2: double к float
        double doubleValue = 9.99;
        float floatValue = (float) doubleValue; // Сужающее преобразование, возможна птеря точности
        System.out.println("double to float: " + floatValue); // 9.99
      
        // Пример 4: float к int
        float floatValue2 = 5.75f;
        int intFromFloat = (int) floatValue2; // Сужающее преобразование, десятичная часть отбрасывается
        System.out.println("float toк int: " + intFromFloat); // 5
    }
}
