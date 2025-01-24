package academy.bentodev.javaoneforall.Regex.Test;

import javax.sound.sampled.FloatControl;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {

        /**
         * Meta caracteres
         * \d -> todos os digitos
         * \D -> tudo que n'ao for digito
         * \s -> espacos em branco - \t \n \f \r
         * \S -> todos os caracteres, menos os brancos
         * \w -> caracteres de a-z, ou seja, todas letras do alfabeto, digitos e underline(basicamente tudo menos os caracteres especiais)
         * \W -> tudo que nao for incluso no \w
         * [] -> range de coisas que vc escolhe colocar
         */

        String regex = "0[xX][0-9a-fA-F]";
//        String textTest = "abaaba";

        String textTest2 = "12 0x 0X 0xffabc 0x109 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(textTest2);

        System.out.println("text:   " + textTest2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: regex");
        System.out.println("posicoes encontradas");

        while(matcher.find()){
            System.out.println(matcher.start()+ " " + matcher.group() + " ");
        }
    }
}