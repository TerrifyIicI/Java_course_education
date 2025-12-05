/**
 * Практика #1: Примеры операторов для базовых типов
 *
 * @author Arina
 */
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // ===== Арифметические операторы =====
        int sum = a + b;
        System.out.println("Сложение: " + sum);

        int diff = a - b;
        System.out.println("Разность: " + diff);

        int product = a * b;
        System.out.println("Произведение: " + product);

        int division = a / b;
        System.out.println("Деление: " + division);

        int remainder = a % b;
        System.out.println("Остаток: " + remainder);

        // ===== Операторы присваивания =====
        a += 2;
        System.out.println("a после += 2: " + a);

        a -= 1;
        System.out.println("a после -= 1: " + a);

        a *= 2;
        System.out.println("a после *= 2: " + a);

        a /= 3;
        System.out.println("a после /= 3: " + a);

        a %= 3;
        System.out.println("a после %= 3: " + a);

        // ===== Операторы сравнения =====
        a = 5;
        b = 3;
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreater = (a > b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLess = (a < b);
        boolean isLessOrEqual = (a <= b);

        System.out.println("a == b: " + isEqual);
        System.out.println("a != b: " + isNotEqual);
        System.out.println("a > b: " + isGreater);
        System.out.println("a >= b: " + isGreaterOrEqual);
        System.out.println("a < b: " + isLess);
        System.out.println("a <= b: " + isLessOrEqual);

        // ===== Логические операторы =====
        boolean logicalAnd = (a > 0 && b > 0);
        System.out.println("a > 0 && b > 0: " + logicalAnd);

        boolean logicalOr = (a < 0 || b > 0);
        System.out.println("a < 0 || b > 0: " + logicalOr);

        boolean logicalNot = !(a > 0);
        System.out.println("!(a > 0): " + logicalNot);

        // ===== Инкремент и декремент (префиксная и постфиксная форма) =====
        int x = 5;
        System.out.println("x до префиксного ++: " + x);
        System.out.println("префиксный ++x: " + ++x);
        System.out.println("постфиксный x++: " + x++);
        System.out.println("x после постфиксного x++: " + x);

        x = 5;
        System.out.println("x до префиксного --: " + x);
        System.out.println("префиксный --x: " + --x);
        System.out.println("постфиксный x--: " + x--);
        System.out.println("x после постфиксного x--: " + x);

        // ===== Тернарный оператор ?: =====
        int max = (a > b) ? a : b;
        System.out.println("Максимум из a и b: " + max);

        String result = (a % 2 == 0) ? "чётное" : "нечётное";
        System.out.println("a - " + result);

        // ===== Побитовые операторы =====
        int m = 5;  // 0101 в двоичной
        int n = 3;  // 0011 в двоичной

        System.out.println("m | n (побитовое ИЛИ): " + (m | n));   // 7 (0111)
        System.out.println("m ^ n (исключающее ИЛИ): " + (m ^ n)); // 6 (0110)
        System.out.println("m & n (побитовое И): " + (m & n));     // 1 (0001)
        System.out.println("~m (побитовое НЕ): " + (~m));          // -6

        // ===== Операторы сдвига =====
        int num = 8;  // 1000 в двоичной
        System.out.println("num >> 1 (сдвиг вправо): " + (num >> 1));      // 4
        System.out.println("num >>> 1 (беззнаковый сдвиг): " + (num >>> 1)); // 4
        System.out.println("num << 1 (сдвиг влево): " + (num << 1));       // 16

        // ===== Скобки и приоритет =====
        int priorityResult = 2 + 3 * 4;
        System.out.println("2 + 3 * 4 = " + priorityResult);  // 14

        int bracketResult = (2 + 3) * 4;
        System.out.println("(2 + 3) * 4 = " + bracketResult); // 20

        // ===== Оператор индекса [] =====
        int[] arr = {1, 2, 3};
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);

        // ===== Операторы для String =====
        String hello = "Hello";
        String world = "World";
        String greeting = hello + " " + world;
        System.out.println("Конкатенация строк: " + greeting);

        String message = "Hello";
        message += " World";
        System.out.println("Результат += для строк: " + message);

        // Сравнение строк
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        System.out.println("str1 == str2: " + (str1 == str2));   // true (из пула литералов)
        System.out.println("str1 == str3: " + (str1 == str3));   // false (разные объекты)
        System.out.println("str1 != str3: " + (str1 != str3));   // true
    }
}
