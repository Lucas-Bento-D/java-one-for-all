package academy.bentodev.javaoneforall.Regex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {

        /**
         * Para usar regex no Java, precisamos da classe Pattern e da classe Matcher, a principio a classe pattern é para
         * setar um padrão de um regex criado e a matcher é para verificação desse padrão em um texto, por exemplo.
         */

        String regex = "aba";
//        String textTest = "abaaba";

        String textTest2 = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(textTest2);

        System.out.println("text:   " + textTest2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: regex");
        System.out.println("posicoes encontradas");

        while(matcher.find()){
            System.out.print(matcher.start()+ " ");
        }
    }
}
