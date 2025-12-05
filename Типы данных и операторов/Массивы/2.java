import java.util.Arrays;
/**
 * Практика #2: Примеры использования методов класса Arrays
 *
 * @author Arina
 */
public class ArraysExample {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 8, 1, 9, 3};
        int[] arr2 = {5, 2, 8, 1, 9, 3};
        int[] arr3 = {1, 2, 3, 4, 5};

        // ===== toString() =====
        // Преобразует массив в строковое представление
        System.out.println("toString(arr1): " + Arrays.toString(arr1));
        // Вывод: [5, 2, 8, 1, 9, 3]

        // ===== sort() =====
        // Сортирует массив по возрастанию
        Arrays.sort(arr1);
        System.out.println("После sort(arr1): " + Arrays.toString(arr1));
        // Вывод: [1, 2, 3, 5, 8, 9]

        // ===== binarySearch() =====
        // Ищет элемент в отсортированном массиве, возвращает индекс
        int index = Arrays.binarySearch(arr1, 5);
        System.out.println("binarySearch(arr1, 5): " + index);
        // Вывод: 3

        int notFound = Arrays.binarySearch(arr1, 7);
        System.out.println("binarySearch(arr1, 7): " + notFound);
        // Вывод: отрицательное число (элемент не найден)

        // ===== equals() =====
        // Сравнивает два массива на равенство элементов
        boolean isEqual1 = Arrays.equals(arr1, arr2);
        System.out.println("equals(arr1, arr2): " + isEqual1);
        // Вывод: false (arr1 отсортирован, arr2 нет)

        Arrays.sort(arr2);
        boolean isEqual2 = Arrays.equals(arr1, arr2);
        System.out.println("equals(arr1, arr2) после сортировки: " + isEqual2);
        // Вывод: true

        boolean isEqual3 = Arrays.equals(arr1, arr3);
        System.out.println("equals(arr1, arr3): " + isEqual3);
        // Вывод: false

        // ===== compare() =====
        // Сравнивает массивы лексикографически
        // Возвращает: 0 если равны, < 0 если первый меньше, > 0 если первый больше
        int[] arrA = {1, 2, 3};
        int[] arrB = {1, 2, 3};
        int[] arrC = {1, 2, 4};
        int[] arrD = {1, 2};

        int cmp1 = Arrays.compare(arrA, arrB);
        System.out.println("compare(arrA, arrB): " + cmp1);
        // Вывод: 0 (массивы равны)

        int cmp2 = Arrays.compare(arrA, arrC);
        System.out.println("compare(arrA, arrC): " + cmp2);
        // Вывод: отрицательное число (arrA < arrC, так как 3 < 4)

        int cmp3 = Arrays.compare(arrA, arrD);
        System.out.println("compare(arrA, arrD): " + cmp3);
        // Вывод: положительное число (arrA длиннее)
    }
}
