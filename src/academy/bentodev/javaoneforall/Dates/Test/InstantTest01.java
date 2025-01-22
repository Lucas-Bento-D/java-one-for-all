package academy.bentodev.javaoneforall.Dates.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {

        /**
         * Instant é parecida com a classe date(que trabalha com o ms a partir de 1970), porém trabalhando com nano segundos.
         * Instant trabalha com Zulu time, que é o horario de greenwich.
         */

        Instant now = Instant.now();
        System.out.println(LocalDateTime.now());
        System.out.println(now);
        System.out.println(Clock.systemUTC());
    }
}
