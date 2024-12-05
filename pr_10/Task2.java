import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array1 = {5, 3, 8, 1, 2};
        int[] array2 = {5, 3, 8, 1, 2};

        // Преобразование массива в строку
        System.out.println("Массив 1: " + Arrays.toString(array1));
        
        // Сортировка массива
        Arrays.sort(array1);
        System.out.println("Отсортированный массив 1: " + Arrays.toString(array1));
        
        // Поиск элемента
        int index = Arrays.binarySearch(array1, 3);
        System.out.println("Индекс числа 3 в отсортированном массиве: " + index);
        
        // Сравнение массивов
        boolean areEqual = Arrays.equals(array1, array2);
        System.out.println("Массивы равны: " + areEqual);
        
        // Сравнение массивов (поэлементно)
        int comparisonResult = Arrays.compare(array1, array2);
        System.out.println("Результат сравнения массивов: " + comparisonResult);
        
        // В случае, если массивы равны, comparisonResult вернёт 0.
        if (comparisonResult == 0) {
            System.out.println("Массивы равны.");
        } else {
            System.out.println("Массивы не равны.");
        }
    }
}
