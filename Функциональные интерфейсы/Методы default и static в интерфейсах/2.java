/**
 * Практика 2: Конфликт default методов при множественной реализации
 *
 * @author Arina
 */
interface InterfaceA {
    default void commonMethod() {
        System.out.println("Default method in InterfaceA");
    }
}

interface InterfaceB {
    default void commonMethod() {
        System.out.println("Default method in InterfaceB");
    }
}

// Класс, реализующий оба интерфейса
class MyClass implements InterfaceA, InterfaceB {
    
    // Обязательно переопределить метод, иначе — ошибка компиляции
    @Override
    public void commonMethod() {
        System.out.println("Overridden method in MyClass");
    }
}

// Класс с вызовом конкретного default метода
class AnotherClass implements InterfaceA, InterfaceB {
    
    @Override
    public void commonMethod() {
        // Вызов default метода конкретного интерфейса
        InterfaceA.super.commonMethod();
    }
}

// Класс, комбинирующий оба default метода
class CombinedClass implements InterfaceA, InterfaceB {
    
    @Override
    public void commonMethod() {
        System.out.println("Combined implementation:");
        InterfaceA.super.commonMethod();
        InterfaceB.super.commonMethod();
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        obj1.commonMethod();  // Overridden method in MyClass
        
        AnotherClass obj2 = new AnotherClass();
        obj2.commonMethod();  // Default method in InterfaceA
        
        CombinedClass obj3 = new CombinedClass();
        obj3.commonMethod();
        // Combined implementation:
        // Default method in InterfaceA
        // Default method in InterfaceB
    }
}
