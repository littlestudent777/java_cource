public class CustomException extends Exception {
    public CustomException() {
        super(); // Вызывает конструктор родительского класса Exception без параметров
    }

    public CustomException(String message) {
        super(message); // Передает сообщение об ошибке в конструктор родительского класса
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause); // Передает сообщение и причину в конструктор родительского класса
    }

    public CustomException(Throwable cause) {
        super(cause); // Передает причину в конструктор родительского класса
    }
}
