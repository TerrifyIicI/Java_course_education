/**
 * Практика #1: Способы инициализации final-поля
 *
 * @author Arina
 */

// 1. Инициализация при объявлении
class Example1 {
    public final int a = 10;
}

// 2. Инициализация в конструкторе
class Example2 {
    public final int a;

    public Example2() {
        a = 10;
    }
}

// 3. Инициализация в конструкторе с параметром
class Example3 {
    public final int a;

    public Example3(int value) {
        a = value;
    }
}

// 4. Инициализация в блоке инициализации
class Example4 {
    public final int a;

    {
        a = 10;
    }
}

// 5. Инициализация в нескольких конструкторах (каждый должен инициализировать)
class Example5 {
    public final int a;

    public Example5() {
        a = 10;
    }

    public Example5(int value) {
        a = value;
    }
}
