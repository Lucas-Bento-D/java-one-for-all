package academy.bentodev.javaoneforall.Formatation.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        String datePartten = "'local: ' dd 'de' MM 'de' yyyy \nHH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(datePartten);
        System.out.println(sdf.format(new Date()));

    }
}
