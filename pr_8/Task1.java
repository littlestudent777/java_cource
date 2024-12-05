public class Task1 {
    public static void main(String[] args) {
        // Пример с целым числом (int)
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            default:
                System.out.println("Неизвестный день недели");
        }

        // Пример с символом (char)
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Отлично");
                break;
            case 'B':
                System.out.println("Хорошо");
                break;
            case 'C':
                System.out.println("Удовлетворительно");
                break;
            case 'D':
                System.out.println("Неудовлетворительно");
                break;
            default:
                System.out.println("Неизвестная оценка");
        }

        // Пример с строкой (String)
        String colour = "белый";
        switch (colour) {
            case "белый":
            case "чёрный":
                System.out.println("Чёрно-белое");
                break;
            default:
                System.out.println("Цветное");
        }

        // Пример с перечислением (enum)
        DayOfWeek dayOfWeek = DayOfWeek.FRIDAY;
        switch (dayOfWeek) {
            case MONDAY:
                System.out.println("Начало рабочей недели");
                break;
            case FRIDAY:
                System.out.println("Конец рабочей недели");
                break;
            default:
                System.out.println("День недели");
        }
    }

    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
