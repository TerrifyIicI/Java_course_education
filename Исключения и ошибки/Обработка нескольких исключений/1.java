/**
 *
 * @author Arina
 */

// Создаём иерархию исключений: Ex1 <-- Ex2 <-- Ex3
class Ex1 extends Exception {
    public Ex1(String message) {
        super(message);
    }
}

class Ex2 extends Ex1 {
    public Ex2(String message) {
        super(message);
    }
}

class Ex3 extends Ex2 {
    public Ex3(String message) {
        super(message);
    }
}

public class MultiCatchExample {
    public static void main(String[] args) {
        // Ситуация 1: Несколько исключений обрабатываются идентично
        System.out.println("=== Идентичная обработка через | ===");
        identicalHandling(1);
        identicalHandling(2);
        identicalHandling(3);

        // Ситуация 2: Иерархия исключений
        System.out.println("\n=== Иерархия исключений ===");
        hierarchyHandling(1);
        hierarchyHandling(2);
        hierarchyHandling(3);
    }

    // Ситуация 1: Идентичная обработка нескольких исключений через |
    public static void identicalHandling(int type) {
        try {
            if (type == 1) {
                throw new ArithmeticException("Арифметическая ошибка");
            } else if (type == 2) {
                throw new NumberFormatException("Ошибка формата числа");
            } else {
                throw new IllegalArgumentException("Недопустимый аргумент");
            }
        } catch (ArithmeticException | NumberFormatException | IllegalArgumentException e) {
            // Все три исключения обрабатываются одинаково
            System.out.println("Перехвачено: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

    // Ситуация 2: Обработка иерархии исключений
    public static void hierarchyHandling(int type) {
        try {
            if (type == 1) {
                throw new Ex3("Исключение Ex3");
            } else if (type == 2) {
                throw new Ex2("Исключение Ex2");
            } else {
                throw new Ex1("Исключение Ex1");
            }
        } catch (Ex3 e) {
            // Сначала ловим самый конкретный тип
            System.out.println("Обработка Ex3: " + e.getMessage());
        } catch (Ex2 e) {
            // Затем более общий
            System.out.println("Обработка Ex2: " + e.getMessage());
        } catch (Ex1 e) {
            // В конце самый общий
            System.out.println("Обработка Ex1: " + e.getMessage());
        }
    }
}
