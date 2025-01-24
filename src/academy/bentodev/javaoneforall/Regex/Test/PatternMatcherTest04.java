package academy.bentodev.javaoneforall.Regex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
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
         * ? -> 0 ou 1
         * * -> 0 ou mais
         * + -> uma ou mais ocorrencias
         * {n,m} -> de n a m
         * () -> agrupamento
         * | -> ou
         * $ -> fim da linha
         * . -> caracter coringa
         */

        String regex = "(\\S)+@([a-zA-Z])+(\\.([a-zA-Z])+){1,2}";

        String textTest2 = "luffy@hotmail.com, 123jotaro@gmail.com, !@$zoro@mail.com.br teste@gmail.com, sakura@mail, teste$!@mail.com";
        System.out.println("Email valido");
        System.out.println("!@$zoro@mail.com.br".matches(regex));
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