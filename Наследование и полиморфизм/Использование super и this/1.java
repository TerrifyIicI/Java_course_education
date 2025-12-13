/**
 *
 * @author Arina
 */
class Parent {
    protected int value;

    public Parent(int value) {
        this.value = value;
        System.out.println("Parent constructor: value = " + value);
    }

    public void display() {
        System.out.println("Parent display: value = " + value);
    }
}

class Child extends Parent {
    private int value;  // Скрывает поле родителя

    public Child(int parentValue, int childValue) {
        // 1. Вызов конструктора суперкласса
        super(parentValue);
        this.value = childValue;
        System.out.println("Child constructor: value = " + childValue);
    }

    @Override
    public void display() {
        // 2. Доступ к полю суперкласса
        System.out.println("Parent value (super.value): " + super.value);
        System.out.println("Child value (this.value): " + this.value);

        // 3. Вызов метода суперкласса
        super.display();
        System.out.println("Child display completed");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child(10, 20);
        child.display();
    }
}
