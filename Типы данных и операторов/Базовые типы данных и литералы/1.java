public class DataTypes {
    public static void main(String[] args) {
        // Целочисленные типы
        byte byteValue = 127;
        byte byteZero = 0;
        
        short shortValue = 32767;
        short shortZero = 0;
        
        int intValue = 2147483647;
        int intZero = 0;
        
        long longValue = 9223372036854775807L;
        long longZero = 0L;
        
        // Типы с плавающей точкой
        float floatValue = 3.14f;
        float floatZero = 0.0f;
        
        double doubleValue = 3.141592653589793;
        double doubleZero = 0.0;
        
        // Символьный тип
        char charValue = 'A';
        char charZero = '\u0000';
        
        // Булевский тип
        boolean booleanValue = true;
        boolean booleanZero = false;
        
        System.out.println("byte: " + byteValue + ", zero: " + byteZero);
        System.out.println("short: " + shortValue + ", zero: " + shortZero);
        System.out.println("int: " + intValue + ", zero: " + intZero);
        System.out.println("long: " + longValue + ", zero: " + longZero);
        System.out.println("float: " + floatValue + ", zero: " + floatZero);
        System.out.println("double: " + doubleValue + ", zero: " + doubleZero);
        System.out.println("char: " + charValue + ", zero: [" + charZero + "]");
        System.out.println("boolean: " + booleanValue + ", zero: " + booleanZero);
    }
}
