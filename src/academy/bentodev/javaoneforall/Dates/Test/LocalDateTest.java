package academy.bentodev.javaoneforall.Dates.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest {
    public static void main(String[] args) {

        /**
         * A classe LocaleDate Tem diversos métodos para tratamento de data, como os gets de ano, mes, semana, dia do mes
         * logicas para adicionar datas para frente ou retirar datas de alguma data, podemos at[e mesmo setar uma data na
         * "mão"
         */

        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.of(2025, Month.JANUARY, 21);
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(date);
    }
}
