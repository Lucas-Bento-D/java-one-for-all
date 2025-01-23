package academy.bentodev.javaoneforall.Dates.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class CronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(1998, Month.MAY, 20, 16, 0);
        LocalDateTime now = LocalDateTime.now();
        long days = ChronoUnit.DAYS.between(birthday, now);
        long weeks = ChronoUnit.WEEKS.between(birthday, now);
        long months = ChronoUnit.MONTHS.between(birthday, now);
        long years = ChronoUnit.YEARS.between(birthday, now);

        System.out.println(days);
        System.out.println(weeks);
        System.out.println(months);
        System.out.println(years);

    }
}
