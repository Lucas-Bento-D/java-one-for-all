package academy.bentodev.javaoneforall.String.Test;

public class StringTest01 {
    public static void main(String[] args) {
        /**
         * No java, toda String é imutavel, ou seja, se abrimos duas variaveis para a mesma string, a referencia delas
         * serão iguais.
         */
        String name = "Lucas"; // String constant pool
        String name2 = "Lucas";

        /**
         * Aqui nós fazemos o exercicio de concatenação onde o resultado esperado comunmente seria "Lucas Bento",
         * entretanto, quando fazemos um sout em name após a concatenação, nós vamos ter "Lucas", isso aqui acontece
         * por conta da imutabilidade das Strings, então o Java criou outra referencia na "constant pool" para " Bento",
         * mas isso não quer dizer que name irá receber esse valor, só quer dizer que agora temos duas referencias, "Lucas" e
         * " Bento".
         */
        name.concat(" Bento");
        System.out.println(name);

        /**
         * A partir do momento que pegamos a variavel name e aderimos o valor "name.concat" nela, a referencia dessa
         * variavel será "Lucas Bento" que vai ser uma nova alocação na memoria e terá uma nova referencia na "String
         * constant Pool".
         */
        name = name.concat(" Bento");
        System.out.println(name == name2);

        /**
         * Caso setarmos uma variavel como uma "nova String" e testarmos se ela é igual a que setamos diretamente
         * em uma variavel, teremos o retorno falso, pois é uma verdade que no caso, name3 tera o mesmo calor que
         * name2, entretanto name3 será um novo objeto que tera um valor dentro da String constant pool, então name3 != name2.
         */
        String name3 = new String("Lucas");
        System.out.println(name2 == name3);

        /**
         * Caso utilizarmos o metodo intern(), teremos então o valor localizado dentro do objeto name3 que por sua vez está dentro
         * da string constant pool, igual a name2, com isso, teremos ambas as variaveis fazendo referencia direta ao mesmo valor.
         */

        System.out.println(name2 == name3.intern());

    }
}
