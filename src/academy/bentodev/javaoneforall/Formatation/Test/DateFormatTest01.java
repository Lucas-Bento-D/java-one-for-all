package academy.bentodev.javaoneforall.Formatation.Test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] formatedDate = new DateFormat[7];
        formatedDate[0] = DateFormat.getInstance();
        formatedDate[1] = DateFormat.getDateInstance();
        formatedDate[2] = DateFormat.getDateTimeInstance();
        formatedDate[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        formatedDate[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        formatedDate[5] = DateFormat.getDateInstance(DateFormat.LONG);
        formatedDate[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat fd: formatedDate){
            System.out.println(fd.format(calendar.getTime()));
        }
    }
}
