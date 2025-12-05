/**
 * Практика #1: Преобразование if-else в тернарный оператор
 *
 * @author Arina
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 2;
        
        int i = (a == 1) ? 1 : (a == 2) ? 2 : 3;
        
        System.out.println("i = " + i);
    }
}
