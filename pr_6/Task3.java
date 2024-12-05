// Исключение NullPointerException возникает, если значение null распаковывается в примитивный тип.
// Автоупаковка и автораспаковка работают только с непустыми значениями.
// Попытка получить примитивное значение из null вызывет исключение.

public class Task3 {
    public static void main(String[] args) {
        Integer nullVal = null;
        int val = nullVal; // NullPointerException

    }
}
