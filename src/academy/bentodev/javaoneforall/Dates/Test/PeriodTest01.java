package academy.bentodev.javaoneforall.Dates.Test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {

        /**
         * Similar a classe Duration, Period tambem é uma classe feita para tratamento de periodos entre uma data e outra
         */

        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(2);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);
        Period p4 = Period.ofMonths(3);

        System.out.println(p2);
        System.out.println(p1);
        System.out.println(p3);
        System.out.println(p4);
    }
}
