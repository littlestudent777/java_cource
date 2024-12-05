import java.util.List;

public class Task_8 {
    public static void main(String[] args) {
        var num = 1; // int
        var text = "Example"; // string
        var list = List.of(1, 2, 3, 4); // List<Integer>

        System.out.println("Number: " + num);
        System.out.println("Text: " + text);
        System.out.println("List: " + list);

        // Использование var в цикле
        for (var element : list) {
            System.out.println("Element: " + element);
        }
    }
}
