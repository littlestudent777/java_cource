public class Task1 {

    public enum Day {
        SUNDAY("Воскресенье"),
        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота");

        private final String russianName; 
      
        // Конструктор перечисления
        Day(String russianName) {
            this.russianName = russianName;
        }

        // Метод для получения русского названия дня недели
        public String getRussianName() {
            return russianName;
        }
    }

    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getRussianName());
        }
    }
}
