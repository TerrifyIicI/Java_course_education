/**
 * Практика 1: Демонстрация 10 методов классов StringBuilder и StringBuffer
 *
 * @author Arina
 */
public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        
        // 1. append() — добавляет данные в конец строки
        sb.append(" World");
        System.out.println("append(): " + sb);  // Hello World
        
        // 2. insert(int offset, String str) — вставляет строку в указанную позицию
        sb.insert(5, ",");
        System.out.println("insert(): " + sb);  // Hello, World
        
        // 3. delete(int start, int end) — удаляет подстроку
        sb.delete(5, 6);
        System.out.println("delete(): " + sb);  // Hello World
        
        // 4. deleteCharAt(int index) — удаляет символ по индексу
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt(): " + sb);  // HelloWorld
        
        // 5. replace(int start, int end, String str) — заменяет подстроку
        sb.replace(5, 10, " Java");
        System.out.println("replace(): " + sb);  // Hello Java
        
        // 6. reverse() — переворачивает строку
        StringBuilder sbReverse = new StringBuilder("Hello");
        sbReverse.reverse();
        System.out.println("reverse(): " + sbReverse);  // olleH
        
        // 7. setCharAt(int index, char ch) — заменяет символ по индексу
        sb.setCharAt(0, 'h');
        System.out.println("setCharAt(): " + sb);  // hello Java
        
        // 8. substring(int start, int end) — возвращает подстроку
        String sub = sb.substring(0, 5);
        System.out.println("substring(): " + sub);  // hello
        
        // 9. capacity() — возвращает текущую ёмкость буфера
        int capacity = sb.capacity();
        System.out.println("capacity(): " + capacity);  // 21 (или другое значение)
        
        // 10. setLength(int newLength) — устанавливает длину строки
        sb.setLength(5);
        System.out.println("setLength(): " + sb);  // hello
        
        // Демонстрация StringBuffer (аналогичные методы, но потокобезопасный)
        System.out.println("\n--- StringBuffer ---");
        StringBuffer sbf = new StringBuffer("Thread");
        sbf.append(" Safe");
        sbf.insert(6, "-");
        System.out.println("StringBuffer: " + sbf);  // Thread- Safe
    }
}
