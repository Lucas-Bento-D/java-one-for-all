package academy.bentodev.javaoneforall.Dates.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest02 {
    public static void main(String[] args) {

        /**
         * Duration é uma classe que trata sobre datas, um dos seus principais usos é a diferença de tempo passado entre
         * a data X e a data Y, mas existem outros métodos que podem ser usados, lembrando que Duration não oferece suporte para segundos.
         */

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeBefore7hours = LocalTime.now().minusHours(7);

        Duration dt1 = Duration.between(now, nowAfterTwoYears);
        Duration dt2 = Duration.between(timeNow, timeBefore7hours);
        System.out.println(dt1);
        System.out.println(dt2);
    }
}
