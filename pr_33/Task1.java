public class Task1 {
    public static void main(String[] args) {
        boolean isLiquid = true;
        char grade = 'A';
        int age = 25;
        double salary = 55999.99;
        
        // Получаем текущее время
        long currentTimeMillis = System.currentTimeMillis();
        java.util.Date date = new java.util.Date(currentTimeMillis);
        
        // Форматирование строки с использованием различных спецификаторов
        String formattedString = String.format(
            "Water is liquid: %b\n" +  // логическое значение
            "Grade: %c\n" +       // символьное представление
            "Age: %d years old\n" +  // десятичное целое
            "Salary: %.2f dollars\n" + // десятичное значение с плавающей точкой
            "Current date and time: %tF %tT\n" +  // дата и время
            "%n",                   // новая строка
            isLiquid, 
            grade, 
            age, 
            salary, 
            date,
            date
        );

        // Выводим отформатированную строку
        System.out.println(formattedString);
      /*
      Water is liquid: true
      Grade: A
      Age: 25 years old
      Salary: 55999.99 dollars
      Current date and time: 2024-12-07 07:24:56
      */
    }
}
