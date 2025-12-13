/**
 *
 * @author Arina
 */
class Calculator {
    // Перегруженные методы — одинаковое имя, разные параметры

    public int add(int a, int b) {
        System.out.println("add(int, int)");
        return a + b;
    }

    public int add(int a, int b, int c) {
        System.out.println("add(int, int, int)");
        return a + b + c;
    }

    public double add(double a, double b) {
        System.out.println("add(double, double)");
        return a + b;
    }

    public String add(String a, String b) {
        System.out.println("add(String, String)");
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(2, 3));           // add(int, int)
        System.out.println(calc.add(2, 3, 4));        // add(int, int, int)
        System.out.println(calc.add(2.5, 3.5));       // add(double, double)
        System.out.println(calc.add("Hello, ", "World")); // add(String, String)
    }
}
