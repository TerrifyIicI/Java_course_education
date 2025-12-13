/**
 * Практика 1: Default и static методы в интерфейсе
 *
 * @author Arina
 */
interface MyInterface {
    
    // Абстрактный метод (обычный метод интерфейса)
    void abstractMethod();
    
    // Неабстрактный метод (default)
    default void defaultMethod() {
        System.out.println("Default method in interface");
    }
    
    // Статический метод
    static void staticMethod() {
        System.out.println("Static method in interface");
    }
}

// Класс, использующий default метод без переопределения
class ClassA implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implementation in ClassA");
    }
    // defaultMethod() наследуется как есть
}

// Класс, переопределяющий default метод
class ClassB implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implementation in ClassB");
    }
    
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method in ClassB");
    }
}

public class Main {
    public static void main(String[] args) {
        ClassA objA = new ClassA();
        ClassB objB = new ClassB();
        
        // Вызов абстрактного метода
        objA.abstractMethod();  // Abstract method implementation in ClassA
        objB.abstractMethod();  // Abstract method implementation in ClassB
        
        // Вызов default метода через объект
        objA.defaultMethod();   // Default method in interface
        objB.defaultMethod();   // Overridden default method in ClassB
        
        // Вызов статического метода — только через имя интерфейса
        MyInterface.staticMethod();  // Static method in interface
        
        // objA.staticMethod();  // Ошибка! Статический метод интерфейса нельзя вызвать через объект
    }
}
