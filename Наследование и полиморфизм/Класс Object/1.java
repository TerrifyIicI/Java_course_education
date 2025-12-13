/**
 * @author Arina
 */
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Сравнение с самим собой
        if (obj == null || getClass() != obj.getClass()) return false; // Проверка на null и тип
        Person person = (Person) obj; // Приведение типа
        return age == person.age && name.equals(person.name); // Сравнение полей
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + age; // Генерация хэш-кода
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        Person person3 = new Person("Bob", 25);

        System.out.println(person1.equals(person2)); // true
        System.out.println(person1.equals(person3)); // false
        System.out.println(person1.equals(null)); // false
    }
}

/*
Соглашения для метода equals():

1. Рефлексивность: Объект должен быть равен самому себе (x.equals(x) == true).
2. Симметричность: Если A равно B, то B должно быть равно A.
3. Транзитивность: Если A равно B и B равно C, то A должно быть равно C.
4. Консистентность: Многократные вызовы equals() для одних и тех же объектов 
   должны возвращать одно и то же значение, если поля не изменяются.
5. Неравенство с null: Любой объект не должен быть равен null.

Важно! При переопределении equals() необходимо также переопределить hashCode().
*/
