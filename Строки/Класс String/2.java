import java.util.StringJoiner;

/**
 * Практика 2: Использование класса StringJoiner
 *
 * @author Arina
 */
public class StringJoinerExample {
    public static void main(String[] args) {
        
        // 1. Простое объединение с разделителем
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("Apple");
        joiner1.add("Banana");
        joiner1.add("Orange");
        System.out.println("Simple joiner: " + joiner1);
        // Simple joiner: Apple, Banana, Orange
        
        // 2. Объединение с префиксом и суффиксом
        StringJoiner joiner2 = new StringJoiner(", ", "[", "]");
        joiner2.add("Red");
        joiner2.add("Green");
        joiner2.add("Blue");
        System.out.println("With prefix/suffix: " + joiner2);
        // With prefix/suffix: [Red, Green, Blue]
        
        // 3. Пустой joiner с префиксом и суффиксом
        StringJoiner joiner3 = new StringJoiner(", ", "(", ")");
        System.out.println("Empty joiner: " + joiner3);
        // Empty joiner: ()
        
        // 4. Установка значения по умолчанию для пустого joiner
        StringJoiner joiner4 = new StringJoiner(", ", "[", "]");
        joiner4.setEmptyValue("EMPTY");
        System.out.println("Empty with default: " + joiner4);
        // Empty with default: EMPTY
        
        // 5. Объединение двух StringJoiner
        StringJoiner joiner5 = new StringJoiner("-");
        joiner5.add("One");
        joiner5.add("Two");
        
        StringJoiner joiner6 = new StringJoiner("-");
        joiner6.add("Three");
        joiner6.add("Four");
        
        joiner5.merge(joiner6);
        System.out.println("Merged: " + joiner5);
        // Merged: One-Two-Three-Four
        
        // 6. Получение длины
        System.out.println("Length: " + joiner5.length());
        // Length: 19
    }
}
