public class NarrowingConversion {
    public static void main(String[] args) {
        // double -> float
        double doubleVal = 3.14159265359;
        float floatVal = (float) doubleVal;
        System.out.println("double -> float: " + floatVal);
        
        // double -> int (отбрасывается дробная часть)
        double price = 99.99;
        int roundedPrice = (int) price;
        System.out.println("double -> int: " + roundedPrice);
        
        // long -> int
        long bigNumber = 3000000000L;
        int smallerNumber = (int) bigNumber;
        System.out.println("long -> int: " + smallerNumber + " (переполнение!)");
        
        // int -> byte
        int intVal = 300;
        byte byteVal = (byte) intVal;
        System.out.println("int -> byte: " + byteVal + " (переполнение!)");
    }
}
