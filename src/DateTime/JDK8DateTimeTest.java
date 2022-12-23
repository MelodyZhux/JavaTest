package DateTime;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class JDK8DateTimeTest {
    @Test
    public void testDate() {
        LocalDate now = LocalDate.now();
        LocalTime now1 = LocalTime.now();
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now1);
        System.out.println(now2);
        LocalDateTime of = LocalDateTime.of(2020,10,6,13,11,50);
        System.out.println(of);

        System.out.println(now2.getDayOfMonth());
        System.out.println(now2.getMonth());
        System.out.println(now2.getDayOfWeek());

        LocalDateTime date2 = now2.withDayOfMonth(22);
        System.out.println(now2);
        System.out.println(date2);


    }
    @Test

    public void testDateFormatter() {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime localD = LocalDateTime.now();
        String str1 = formatter.format(localD);
        System.out.println(localD);
        System.out.println(str1);


    }
}
