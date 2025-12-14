/**
 * @author Arina
 */
public class ExceptionExamples {
    public static void main(String[] args) {
        arithmeticExceptionExample();
        arrayIndexOutOfBoundsExceptionExample();
        illegalArgumentExceptionExample();
        classCastExceptionExample();
        nullPointerExceptionExample();
    }

    // ArithmeticException — деление на ноль
    public static void arithmeticExceptionExample() {
        System.out.println("=== ArithmeticException ===");
        try {
            int a = 10;
            int b = 0;
            int result = a / b;  // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    // ArrayIndexOutOfBoundsException — выход за границы массива
    public static void arrayIndexOutOfBoundsExceptionExample() {
        System.out.println("=== ArrayIndexOutOfBoundsException ===");
        try {
            int[] arr = {1, 2, 3};
            int value = arr[5];  // Индекс 5 не существует
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    // IllegalArgumentException — недопустимый аргумент
    public static void illegalArgumentExceptionExample() {
        System.out.println("=== IllegalArgumentException ===");
        try {
            setAge(-5);  // Отрицательный возраст недопустим
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        System.out.println("Возраст: " + age);
    }

    // ClassCastException — неверное приведение типа
    public static void classCastExceptionExample() {
        System.out.println("=== ClassCastException ===");
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj;  // String нельзя привести к Integer
        } catch (ClassCastException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    // NullPointerException — обращение к null
    public static void nullPointerExceptionExample() {
        System.out.println("=== NullPointerException ===");
        try {
            String str = null;
            int length = str.length();  // Вызов метода у null
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
