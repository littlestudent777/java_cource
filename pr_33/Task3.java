import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Получение текущего времени
        Date currentDate = new Date();
        
        // Форматирование строки с использованием различных спецификаторов
        String formattedString = String.format(
            "Текущий час: %tH\n" +    // Час (00–23)
            "Текущие минуты: %tM\n" +  // Минуты как десятичное целое (00–59)
            "Текущие секунды: %tS\n" + // Секунды как десятичное целое (00–59)
            "Текущий год: %tY\n" +     // Год в четырехзначном формате
            "День недели: %tA\n",      // Полное название дня недели (например, "пятница")
            currentDate, 
            currentDate,
            currentDate,
            currentDate,
            currentDate
        );

        // Выводим отформатированную строку
        System.out.println(formattedString);
      /*
      Текущий час: 10
      Текущие минуты: 42
      Текущие секунды: 03
      Текущий год: 2024
      День недели: суббота
      */
    }
}
