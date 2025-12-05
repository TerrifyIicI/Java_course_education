/**
 * Практика #1: Примеры использования метода decode()
 *
 * @author Arina
 */
public class DecodeExample {
    public static void main(String[] args) {
        // Десятичное число
        Integer decimal = Integer.decode("42");
        System.out.println("decode(\"42\"): " + decimal);  // 42

        // Восьмеричное число (префикс 0)
        Integer octal = Integer.decode("012");
        System.out.println("decode(\"012\"): " + octal);   // 10

        // Шестнадцатеричное число (префикс 0x)
        Integer hexLower = Integer.decode("0x1A");
        System.out.println("decode(\"0x1A\"): " + hexLower); // 26

        // Шестнадцатеричное число (префикс 0X)
        Integer hexUpper = Integer.decode("0X1A");
        System.out.println("decode(\"0X1A\"): " + hexUpper); // 26

        // Шестнадцатеричное число (префикс #)
        Integer hexHash = Integer.decode("#FF");
        System.out.println("decode(\"#FF\"): " + hexHash);   // 255

        // Отрицательные числа
        Integer negative = Integer.decode("-0x10");
        System.out.println("decode(\"-0x10\"): " + negative); // -16
    }
}
