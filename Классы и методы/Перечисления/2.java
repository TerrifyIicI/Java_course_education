/**
 *
 * @author Arina
 */
public enum Operation {
    ADD("+") {
        @Override
        public double apply(double a, double b) {
            return a + b;
        }
    },
    SUBTRACT("-") {
        @Override
        public double apply(double a, double b) {
            return a - b;
        }
    },
    MULTIPLY("*") {
        @Override
        public double apply(double a, double b) {
            return a * b;
        }
    },
    DIVIDE("/") {
        @Override
        public double apply(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("Деление на ноль");
            }
            return a / b;
        }
    };

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    // Абстрактный метод, который реализует каждый элемент
    public abstract double apply(double a, double b);
}

class Main {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;

        for (Operation op : Operation.values()) {
            System.out.printf("%.1f %s %.1f = %.1f%n", 
                a, op.getSymbol(), b, op.apply(a, b));
        }
    }
}
