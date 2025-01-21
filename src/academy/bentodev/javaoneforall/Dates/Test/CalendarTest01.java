package academy.bentodev.javaoneforall.Dates.Test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        /**
         * A classe calendar foi a classe criada para substituir e resolver os problemas causados pela classe date
         * A classe calendar [e uma classe abstrata, logo nao usamos o "new ..." tipico de um construtor
         */
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
        System.out.println(Calendar.DAY_OF_WEEK);
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.DAY_OF_YEAR);
        System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);
    }
}
