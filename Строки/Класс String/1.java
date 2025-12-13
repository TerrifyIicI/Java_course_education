/**
 * Практика 1: Демонстрация 10 методов класса String
 *
 * @author Arina
 */
public class StringMethods {
    public static void main(String[] args) {
        String text = "Hello, World!";
        String text2 = "  Java Programming  ";
        
        // 1. length() — возвращает длину строки
        int len = text.length();
        System.out.println("length(): " + len);  // 13
        
        // 2. charAt(int index) — возвращает символ по указанному индексу
        char ch = text.charAt(0);
        System.out.println("charAt(0): " + ch);  // H
        
        // 3. substring(int beginIndex, int endIndex) — возвращает подстроку
        String sub = text.substring(0, 5);
        System.out.println("substring(0, 5): " + sub);  // Hello
        
        // 4. toLowerCase() — преобразует строку в нижний регистр
        String lower = text.toLowerCase();
        System.out.println("toLowerCase(): " + lower);  // hello, world!
        
        // 5. toUpperCase() — преобразует строку в верхний регистр
        String upper = text.toUpperCase();
        System.out.println("toUpperCase(): " + upper);  // HELLO, WORLD!
        
        // 6. trim() — удаляет пробелы в начале и конце строки
        String trimmed = text2.trim();
        System.out.println("trim(): '" + trimmed + "'");  // 'Java Programming'
        
        // 7. replace(char oldChar, char newChar) — заменяет символы
        String replaced = text.replace('o', '0');
        System.out.println("replace('o', '0'): " + replaced);  // Hell0, W0rld!
        
        // 8. contains(CharSequence s) — проверяет наличие подстроки
        boolean contains = text.contains("World");
        System.out.println("contains(\"World\"): " + contains);  // true
        
        // 9. startsWith(String prefix) — проверяет начало строки
        boolean starts = text.startsWith("Hello");
        System.out.println("startsWith(\"Hello\"): " + starts);  // true
        
        // 10. split(String regex) — разбивает строку на массив по разделителю
        String[] parts = text.split(", ");
        System.out.println("split(\", \"): ");
        for (String part : parts) {
            System.out.println("  " + part);  // Hello / World!
        }
    }
}
