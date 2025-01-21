package academy.bentodev.javaoneforall.Formatation.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[1] = NumberFormat.getCurrencyInstance(localePT);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
        double value = 10_000_000.2130;
        for (NumberFormat numberFormat: nfa){
            System.out.println(numberFormat.format(value));
        }
        String valueString = "￥10,000,000";
        try{
            System.out.println(nfa[2].parse(valueString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
