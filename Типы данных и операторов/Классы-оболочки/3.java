/**
 * Практика #3: NullPointerException при автораспаковке
 *
 * @author Arina
 */
public class UnboxingNullExample {
    public static void main(String[] args) {
        // Случай 1: присвоение null переменной базового типа
        Integer nullInteger = null;
        // int value = nullInteger;  // NullPointerException!

        // Случай 2: арифметические операции с null
        Integer a = null;
        Integer b = 5;
        // int sum = a + b;  // NullPointerException!

        // Случай 3: сравнение с примитивом
        Integer c = null;
        // boolean result = (c > 0);  // NullPointerException!

        // Случай 4: передача null в метод, ожидающий примитив
        // printValue(null);  // NullPointerException!

        // Безопасный способ
        Integer safeValue = null;
        if (safeValue != null) {
            int value = safeValue;
            System.out.println("Значение: " + value);
        } else {
            System.out.println("Значение равно null");
        }
    }

    public static void printValue(int value) {
        System.out.println(value);
    }
}
