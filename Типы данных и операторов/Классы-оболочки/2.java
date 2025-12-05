/**
 * Практика #2: Все способы создания экземпляра класса Boolean
 *
 * @author Arina
 */
public class BooleanCreation {
    public static void main(String[] args) {
        // 1. Автоупаковка (boxing)
        Boolean b1 = true;
        Boolean b2 = false;

        // 2. valueOf(boolean)
        Boolean b3 = Boolean.valueOf(true);
        Boolean b4 = Boolean.valueOf(false);

        // 3. valueOf(String) - "true" (без учёта регистра) = true, остальное = false
        Boolean b5 = Boolean.valueOf("true");
        Boolean b6 = Boolean.valueOf("TRUE");
        Boolean b7 = Boolean.valueOf("True");
        Boolean b8 = Boolean.valueOf("false");
        Boolean b9 = Boolean.valueOf("anything"); // false

        // 4. parseBoolean(String) - возвращает примитив boolean
        Boolean b10 = Boolean.parseBoolean("true");
        Boolean b11 = Boolean.parseBoolean("false");

        // 5. Использование констант
        Boolean b12 = Boolean.TRUE;
        Boolean b13 = Boolean.FALSE;

        System.out.println("Автоупаковка true: " + b1);
        System.out.println("valueOf(true): " + b3);
        System.out.println("valueOf(\"true\"): " + b5);
        System.out.println("valueOf(\"anything\"): " + b9);
        System.out.println("parseBoolean(\"true\"): " + b10);
        System.out.println("Boolean.TRUE: " + b12);
    }
}
