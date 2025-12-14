import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Практика 1: Демонстрация метода read()
 *
 * @author Arina
 */
public class InputStreamExample {
    public static void main(String[] args) {
        byte[] data = {72, 101, 108, 108, 111};  // "Hello" в байтах
        
        InputStream inputStream = new ByteArrayInputStream(data);
        
        try {
            int byteRead;
            // read() возвращает -1 при достижении конца потока
            while ((byteRead = inputStream.read()) != -1) {
                System.out.print((char) byteRead);
            }
            System.out.println();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
