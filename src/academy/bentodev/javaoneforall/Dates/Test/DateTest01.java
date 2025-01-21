package academy.bentodev.javaoneforall.Dates.Test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        /**
         * Date é uma classe quase que completamente obsoleta, apesar de aprendermos sobre, usando Java moderno, não utilizaremos essa
         * classe.
         */
        Date date = new Date(); // conta o tempo a partir de ms
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);

    }
}
