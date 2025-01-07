package academy.bentodev.javaoneforall.Wrappers.test;

import java.util.List;

public class WrapperTest01 {
    public static void main(String[] args) {
        // Tipos primitivos
        byte byteP = 1;
        short shortP=1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'P';
        boolean booleanP = false;

        /**
         * Para fazer os tipos primitivos virarem um wrapper, basta começar a tipagem com a primeira letra
         * maiuscula.
         * Quando utilizamos Wrappers, os valores que utilizamos no tipo serão baseados em polimorfismo e não mais em
         * tipos primitivos, ou seja, os valores precisam ser adicionados corretamente ou teremos erros, exemplo disso é:
         * não conseguiremos adicionar um long em um tipo double, pois a classe Double, não aceitará.
         * LEmbrando que tipos primitivos são tipos e wrappers dos tipos são classes, ou seja, estamos agora lidando com
         * objetos. Wrappers tamb[em contam com metodos das classes, diferentes dos tipos primitivos que não tem métodos.
         */

        // wrapper com metodo autoboxing(toda vez que adicionamos um valor direto no wrapper)
        Byte byteW = 1;
        Short shortW=1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        // wrapper com metodo unboxing(aderir uma variavel em uma variavel primitiva)
        int i = intW;

    }
}
