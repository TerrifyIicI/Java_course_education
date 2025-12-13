import java.util.Formatter;
import java.util.Date;

/**
 * Практика #3: Форматирование даты и времени
 *
 * @author Arina
 */
public class DateTimeFormatter {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Date now = new Date();

        // %tH — час (00-23)
        formatter.format("Час: %tH%n", now);

        // %tM — минуты (00-59)
        formatter.format("Минуты: %tM%n", now);

        // %tS — секунды (00-59)
        formatter.format("Секунды: %tS%n", now);

        // %tY — год в четырёхзначном формате
        formatter.format("Год: %tY%n", now);

        // %tB — полное название месяца
        formatter.format("Месяц: %tB%n", now);

        System.out.println(formatter);
        formatter.close();
    }
}
