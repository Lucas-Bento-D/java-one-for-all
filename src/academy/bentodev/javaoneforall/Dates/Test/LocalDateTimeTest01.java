package academy.bentodev.javaoneforall.Dates.Test;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        /**
         * LocalDateTime é basicamente uma junção de LocalDate com LocalTime. Incluindo data e hora.
         * Trazendo os métodos de horas e datas
         */

        LocalDateTime lDT = LocalDateTime.now();
        LocalDateTime test = LocalDateTime.of(2025, Month.APRIL, 10, 13, 40);
        System.out.println(lDT);
    }
}
