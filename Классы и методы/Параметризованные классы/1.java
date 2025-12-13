import java.util.ArrayList;
import java.util.List;

/**
 * Практика #1: Использование instanceof с параметризованными классами
 *
 * @author Arina
 */
public class InstanceofGenerics {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        Wrapper<String> stringWrapper = new Wrapper<>();
        Wrapper<Integer> integerWrapper = new Wrapper<>();

        // Проверка на принадлежность к параметризованному классу (без указания типа)
        System.out.println("stringList instanceof List: " + (stringList instanceof List));           // true
        System.out.println("integerList instanceof List: " + (integerList instanceof List));         // true
        System.out.println("stringList instanceof ArrayList: " + (stringList instanceof ArrayList)); // true

        // Проверка Wrapper
        System.out.println("stringWrapper instanceof Wrapper: " + (stringWrapper instanceof Wrapper));   // true
        System.out.println("integerWrapper instanceof Wrapper: " + (integerWrapper instanceof Wrapper)); // true

        // НЕЛЬЗЯ проверить параметр типа:
        // System.out.println(stringList instanceof List<String>);  // Ошибка компиляции

        // Можно использовать wildcard (?)
        System.out.println("stringList instanceof List<?>: " + (stringList instanceof List<?>));   // true
        System.out.println("integerList instanceof List<?>: " + (integerList instanceof List<?>)); // true

        // Проверка с null
        List<String> nullList = null;
        System.out.println("nullList instanceof List: " + (nullList instanceof List)); // false
    }
}

class Wrapper<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
