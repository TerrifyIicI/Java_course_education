/**
 * Практика 2: Преобразование между String, StringBuilder и StringBuffer
 *
 * @author Arina
 */
public class StringConversion {
    public static void main(String[] args) {
        
        // ===== String -> StringBuilder =====
        String str1 = "Hello";
        StringBuilder sb1 = new StringBuilder(str1);
        System.out.println("String -> StringBuilder: " + sb1);
        
        // ===== String -> StringBuffer =====
        String str2 = "World";
        StringBuffer sbf1 = new StringBuffer(str2);
        System.out.println("String -> StringBuffer: " + sbf1);
        
        // ===== StringBuilder -> String =====
        StringBuilder sb2 = new StringBuilder("Java");
        String str3 = sb2.toString();
        System.out.println("StringBuilder -> String: " + str3);
        
        // ===== StringBuffer -> String =====
        StringBuffer sbf2 = new StringBuffer("Programming");
        String str4 = sbf2.toString();
        System.out.println("StringBuffer -> String: " + str4);
        
        // ===== StringBuilder -> StringBuffer =====
        StringBuilder sb3 = new StringBuilder("Convert");
        StringBuffer sbf3 = new StringBuffer(sb3.toString());
        System.out.println("StringBuilder -> StringBuffer: " + sbf3);
        
        // ===== StringBuffer -> StringBuilder =====
        StringBuffer sbf4 = new StringBuffer("Example");
        StringBuilder sb4 = new StringBuilder(sbf4.toString());
        System.out.println("StringBuffer -> StringBuilder: " + sb4);
    }
}
