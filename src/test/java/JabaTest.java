import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class JabaTest {
    @Test
    void ShouldOpen() {
        String date = "28.11.2020";//12323
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate parsedDate = LocalDate.parse(date, formater);
        Assertions.assertEquals(DayOfWeek.SATURDAY, parsedDate.getDayOfWeek());
    }
}
