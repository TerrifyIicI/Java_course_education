import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Практика 2: Демонстрация метода write(int)
 *
 * @author Arina
 */
public class OutputStreamExample {
    public static void main(String[] args) {
        OutputStream outputStream = new ByteArrayOutputStream();
        
        try {
            // write(int) записывает один байт
            outputStream.write(72);   // H
            outputStream.write(101);  // e
            outputStream.write(108);  // l
            outputStream.write(108);  // l
            outputStream.write(111);  // o
            
            System.out.println("Записано: " + outputStream.toString());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
