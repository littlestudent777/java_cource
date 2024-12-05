public class Task1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        double c = 15.5;

        // Арифметические операторы
        System.out.println("a + b = " + (a + b)); // +
        System.out.println("a - b = " + (a - b)); // -
        System.out.println("a * c = " + (a * c)); // *
        System.out.println("b / a = " + (b / a)); // /
        System.out.println("b % a = " + (b % a)); // %

        // Присваивание с операторами
        a += 5; // a = a + 5
        System.out.println("a after += 5: " + a);
        
        a -= 3; // a = a - 3
        System.out.println("a after -= 3: " + a);
        
        a *= 2; // a = a * 2
        System.out.println("a after *= 2: " + a);
        
        a /= 2; // a = a / 2
        System.out.println("a after /= 2: " + a);
        
        a %= 3; // a = a % 3
        System.out.println("a after %= 3: " + a);

        //++ и --
        int d = 5;
        System.out.println("Prefix increment: " + (++d); // Префиксный ++
        System.out.println("Postfix increment: " + (d++)); // Постфиксный ++
        System.out.println("After postfix increment, d: " + d);
        
        System.out.println("Prefix decrement: " + (--d); // Префиксный --
        System.out.println("Postfix decrement: " + (d--)); // Постфиксный --
        System.out.println("After postfix decrement, d: " + d);

        // Логические операторы
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("bool1 || bool2: " + (bool1 || bool2)); // ||
        System.out.println("bool1 && bool2: " + (bool1 && bool2)); // &&
        
        // Побитовые операторы
        int x = 5; // 0101 в двоичном
        int y = 3; // 0011 в двоичном
        System.out.println("x | y = " + (x | y)); // |
        System.out.println("x ^ y = " + (x ^ y)); // ^
        System.out.println("x & y = " + (x & y)); // &
        
        // Операторы сравнения
        System.out.println("x == y: " + (x == y)); // ==
        System.out.println("x > y: " + (x > y)); // >
        System.out.println("y >= 3: " + (y >= 3)); // >=
        System.out.println("x < y: " + (x < y)); // <
        System.out.println("y <= y: " + (y <= y)); // <=

        // Операторы сдвига
        System.out.println("x << 1: " + (x << 1)); // <<
        System.out.println("x >> 1: " + (x >> 1)); // >>
        System.out.println("x >>> 1: " + (x >>> 1)); // >>>

        // Пример с операторами для строк
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String concatenation (str1 + str2): " + (str1 + " " + str2)); // + (конкатенация строк)
        
        // Использование оператора равенства для строк
        String str3 = "Hello";
        System.out.println("str1 == str3: " + (str1 == str3)); // Только проверяем ссылку
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // Правильное сравнение строк
    }
}
