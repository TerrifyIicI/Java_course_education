/**
 * Практика 1: Собственный класс исключения
 *
 * @author Arina
 */

// Собственное исключение
class InvalidAgeException extends Exception {
    
    // Конструктор без параметров
    public InvalidAgeException() {
        super();
    }
    
    // Конструктор с сообщением
    public InvalidAgeException(String message) {
        super(message);
    }
    
    // Конструктор с сообщением и причиной
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}

class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Возраст не может быть отрицательным: " + age);
        }
        if (age > 150) {
            throw new InvalidAgeException("Возраст не может быть больше 150: " + age);
        }
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        // Корректное создание
        try {
            Person person1 = new Person("Ivan", 25);
            System.out.println("Создан: " + person1);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        // Отрицательный возраст
        try {
            Person person2 = new Person("Anna", -5);
            System.out.println("Создан: " + person2);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        // Слишком большой возраст
        try {
            Person person3 = new Person("Bob", 200);
            System.out.println("Создан: " + person3);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
