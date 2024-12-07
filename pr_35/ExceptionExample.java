import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            readFile("несуществующий_файл.txt"); // FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("Исключение: файл не найден");
        }

        // Исключение не будет перехвачено и приведет к аварийному завершению программы
        int[] array = new int[3];
        System.out.println(array[4]); // Это вызовет ArrayIndexOutOfBoundsException
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
