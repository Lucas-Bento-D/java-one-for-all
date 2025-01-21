package academy.bentodev.javaoneforall.Dates.Test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {

        /**
         * LocalTime tem a mesma finalidade do LocalDate, mas para o tempo em horas.
         * Também conta com diversos métodos para requisitar dados mais especificos como hora, minuto, segundo e etc.
         * Podemos setar uma hora na "mão" ou adicionar e tirar horas.
         */

        LocalTime now = LocalTime.now();
        LocalTime time = LocalTime.of(23, 59, 00);
        System.out.println(time);
        System.out.println(now);
    }
}
