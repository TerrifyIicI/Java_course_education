/**
 *
 * @author Arina
 */
interface MyInterface {
    
    // Метод интерфейса
    void interfaceMethod();
    
    // Вложенный класс в интерфейсе (неявно static)
    class NestedClass {
        private String message = "Hello from NestedClass";
        
        public void display() {
            System.out.println(message);
        }
        
        public static void staticMethod() {
            System.out.println("Static method in NestedClass");
        }
    }
    
    // Ещё один вложенный класс
    class Helper {
        public int calculate(int a, int b) {
            return a + b;
        }
    }
}

// Класс, реализующий интерфейс
class MyClass implements MyInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("Implementation of interfaceMethod");
    }
}

public class Main {
    public static void main(String[] args) {
        // Способ 1: Создание экземпляра вложенного класса через имя интерфейса
        MyInterface.NestedClass nested = new MyInterface.NestedClass();
        nested.display();
        
        // Способ 2: Вызов статического метода вложенного класса
        MyInterface.NestedClass.staticMethod();
        
        // Способ 3: Использование другого вложенного класса
        MyInterface.Helper helper = new MyInterface.Helper();
        int result = helper.calculate(5, 3);
        System.out.println("Result: " + result);
        
        // Обычное использование интерфейса
        MyClass myClass = new MyClass();
        myClass.interfaceMethod();
    }
}
