
package util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {

    public static LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    public static String getCurrentDateTime() {
        return LocalDateTime.now().format(
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
        );
    }

    public static String getCurrentZonedDateTime() {
        return ZonedDateTime.now().toString();
    }
}
